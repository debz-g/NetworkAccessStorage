package dev.redfox.networkaccessstorage.ui

import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.result.contract.ActivityResultContracts
import androidx.navigation.fragment.findNavController
import dagger.hilt.android.AndroidEntryPoint
import dev.redfox.networkaccessstorage.R
import dev.redfox.networkaccessstorage.databinding.FragmentUploadFileBinding
import dev.redfox.networkaccessstorage.databinding.FragmentViewFilesBinding

@AndroidEntryPoint
class ViewFilesFragment : Fragment() {
    private var _binding: FragmentViewFilesBinding? = null
    private val binding
        get() = _binding!!



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentViewFilesBinding.inflate(inflater, container, false)

        binding.btnUpload.setOnClickListener {
            findNavController().navigate(R.id.action_viewFilesFragment_to_uploadFileFragment)
        }

        return binding.root
    }

}