package dev.redfox.networkaccessstorage.ui

import android.app.Activity
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.provider.MediaStore
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
import okhttp3.Callback
import okhttp3.MediaType
import okhttp3.MediaType.Companion.toMediaTypeOrNull
import okhttp3.MultipartBody
import okhttp3.RequestBody
import okhttp3.RequestBody.Companion.asRequestBody
import java.io.File
import java.io.FileOutputStream

@AndroidEntryPoint
class UploadFileFragment : Fragment() {
    private var _binding: FragmentUploadFileBinding? = null
    private val binding
        get() = _binding!!

    private val REQUEST_PICK_FILE = 1

    var imageUri: Uri? = null
    private val contract = registerForActivityResult(ActivityResultContracts.GetContent()) {
        imageUri = it!!
        binding.ivProduct.setImageURI(it)
    }
    val nasViewModel: NasViewModel by viewModels()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentUploadFileBinding.inflate(inflater, container, false)

        binding.ivProduct.setOnClickListener {
            contract.launch("image/*")
//            pickFile()
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

    private fun pickFile() {
        val intent = Intent(Intent.ACTION_GET_CONTENT)
        intent.type = "application/pdf"
        startActivityForResult(intent, REQUEST_PICK_FILE)
    }

    private fun getRealPathFromUri(uri: Uri): String? {
        val projection = arrayOf(MediaStore.Images.Media.DATA)
        val cursor = requireActivity().contentResolver?.query(uri, projection, null, null, null)
        cursor?.let {
            val columnIndex = it.getColumnIndexOrThrow(MediaStore.Images.Media.DATA)
            it.moveToFirst()
            val filePath = it.getString(columnIndex)
            it.close()
            return filePath
        }
        return null
    }

    private fun uploadFile(filePath: String) {
        val file = File(filePath)
        val requestBody = file.asRequestBody("application/pdf".toMediaTypeOrNull())
        val filePart = MultipartBody.Part.createFormData("file", file.name, requestBody)

        nasViewModel.upload(filePart)

    }


    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == REQUEST_PICK_FILE && resultCode == Activity.RESULT_OK) {
            val uri = data?.data
            val filePath = uri?.let { getRealPathFromUri(it) }
            filePath?.let {
                uploadFile(it) }
        }
    }


}

