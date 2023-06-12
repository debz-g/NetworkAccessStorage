package dev.redfox.networkaccessstorage.viewmodels

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import dev.redfox.networkaccessstorage.models.LoginResponseData
import dev.redfox.networkaccessstorage.models.WebUrlResponse
import dev.redfox.networkaccessstorage.models.WriteResponseData
import dev.redfox.networkaccessstorage.networking.NasRepository
import kotlinx.coroutines.launch
import okhttp3.MultipartBody
import okhttp3.RequestBody
import retrofit2.Response
import javax.inject.Inject

@HiltViewModel
class NasViewModel @Inject constructor(private val nasRepository: NasRepository):  ViewModel() {
    private val _loginResponse = MutableLiveData<Response<List<LoginResponseData>>>()
    val loginResponse: MutableLiveData<Response<List<LoginResponseData>>> get() = _loginResponse

    private val _uploadResponse = MutableLiveData<Response<List<WriteResponseData>>>()
    val uploadResponse: MutableLiveData<Response<List<WriteResponseData>>> get() = _uploadResponse

    private val _webUrlResponse = MutableLiveData<Response<List<WebUrlResponse>>>()
    val webUrlResponse: MutableLiveData<Response<List<WebUrlResponse>>> get() = _webUrlResponse

    fun login(email: String, password: String){
        viewModelScope.launch {
            val loginResponse=nasRepository.login(email,password)
            _loginResponse.value = loginResponse
        }
    }

    fun upload(file: MultipartBody.Part){
        viewModelScope.launch {
            val uploadResponse = nasRepository.upload(file)
            _uploadResponse.value = uploadResponse
        }
    }

    fun webUrl(){
        viewModelScope.launch {
            val webUrl = nasRepository.getWebUrl()
            _webUrlResponse.value = webUrl
        }
    }
}