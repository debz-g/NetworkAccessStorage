package dev.redfox.networkaccessstorage.ui

import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts
import androidx.activity.viewModels
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import dagger.hilt.android.AndroidEntryPoint
import dev.redfox.networkaccessstorage.R
import dev.redfox.networkaccessstorage.databinding.FragmentUploadFileBinding
import dev.redfox.networkaccessstorage.viewmodels.NasViewModel
import okhttp3.MediaType.Companion.toMediaTypeOrNull
import okhttp3.MultipartBody
import okhttp3.RequestBody.Companion.asRequestBody
import java.io.File
import java.io.FileOutputStream

@AndroidEntryPoint
class UploadFileFragment : Fragment() {
    private var _binding: FragmentUploadFileBinding? = null
    private val binding
        get() = _binding!!

    var imageUri: Uri? = null
    private val contract = registerForActivityResult(ActivityResultContracts.GetContent()) {
        imageUri = it!!
        binding.ivProduct.setImageURI(it)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentUploadFileBinding.inflate(inflater, container, false)
        val nasViewModel: NasViewModel by viewModels()
        binding.ivProduct.setOnClickListener {
            contract.launch("image/*")
        }

        binding.btnAdd.setOnClickListener {
            val filesDir = requireActivity().filesDir
            val file = File(filesDir, "image.png")
            val inputStream = requireActivity().contentResolver.openInputStream(imageUri!!)
            val outputStream = FileOutputStream(file)
            inputStream!!.copyTo(outputStream)

            val requestBody = file.asRequestBody("image/*".toMediaTypeOrNull())
            val body =
                MultipartBody.Part.createFormData("myFile", file.name, requestBody)

            nasViewModel.upload(body)

            nasViewModel.uploadResponse.observe(viewLifecycleOwner, Observer {
                if(it.body()!![0].status==  true){
                    Toast.makeText(context, "Photo Uploaded", Toast.LENGTH_SHORT).show()
                    findNavController().navigate(R.id.action_uploadFileFragment_to_viewFilesFragment)
                }
            })
        }

        return binding.root
    }

}