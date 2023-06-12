package dev.redfox.networkaccessstorage.ui

import android.annotation.SuppressLint
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebViewClient
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import dagger.hilt.android.AndroidEntryPoint
import dev.redfox.networkaccessstorage.R
import dev.redfox.networkaccessstorage.databinding.FragmentUploadFileBinding
import dev.redfox.networkaccessstorage.databinding.FragmentViewFilesBinding
import dev.redfox.networkaccessstorage.viewmodels.NasViewModel


@AndroidEntryPoint
class ViewFilesFragment : Fragment() {
    private var _binding: FragmentViewFilesBinding? = null
    private var webUrl = ""
    private val binding
        get() = _binding!!

    val nasViewModel: NasViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentViewFilesBinding.inflate(inflater, container, false)

        nasViewModel.webUrl()

        nasViewModel.webUrlResponse.observe(viewLifecycleOwner, Observer {
            webUrl = it.body()!![0].readLink!!
        })

        binding.btnUpload.setOnClickListener {
            findNavController().navigate(R.id.action_viewFilesFragment_to_uploadFileFragment)
        }

        binding.swiperefresh.setOnRefreshListener {
            binding.webView.reload()
            binding.swiperefresh.isRefreshing = false
        }
        
        binding.btnReload.setOnClickListener { 
            setupWebView()
            Toast.makeText(context, "Reloading", Toast.LENGTH_SHORT).show()
        }

        setupWebView()
        return binding.root
    }


    @SuppressLint("SetJavaScriptEnabled")
    private fun setupWebView() {
        binding.webView.webViewClient = WebViewClient()
        binding.webView.apply {
            loadUrl(webUrl)
            settings.javaScriptEnabled = true
        }
    }

}