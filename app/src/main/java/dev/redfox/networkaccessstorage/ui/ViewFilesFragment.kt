package dev.redfox.networkaccessstorage.ui

import android.annotation.SuppressLint
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebViewClient
import androidx.activity.result.contract.ActivityResultContracts
import androidx.navigation.fragment.findNavController
import dagger.hilt.android.AndroidEntryPoint
import dev.redfox.networkaccessstorage.R
import dev.redfox.networkaccessstorage.databinding.FragmentUploadFileBinding
import dev.redfox.networkaccessstorage.databinding.FragmentViewFilesBinding
import dev.redfox.networkaccessstorage.utils.Constant.Companion.WEB_URL

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

        setupWebView()

        binding.btnUpload.setOnClickListener {
            findNavController().navigate(R.id.action_viewFilesFragment_to_uploadFileFragment)
        }

        return binding.root
    }

    @SuppressLint("SetJavaScriptEnabled")
    private fun setupWebView() {
        binding.webView.webViewClient = WebViewClient()
        binding.webView.apply {
            loadUrl(WEB_URL)
            settings.javaScriptEnabled = true
        }
    }

}