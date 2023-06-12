package dev.redfox.networkaccessstorage.networking

import dev.redfox.networkaccessstorage.models.LoginResponseData
import dev.redfox.networkaccessstorage.models.WebUrlResponse
import dev.redfox.networkaccessstorage.models.WriteResponseData
import okhttp3.MultipartBody
import retrofit2.Response
import javax.inject.Inject

class NasRepository @Inject constructor(private val nasApiInterface: NasApiInterface) {
    suspend fun login(username: String, password:String): Response<List<LoginResponseData>> {
        return nasApiInterface.loginApi(username,password)
    }

    suspend fun upload(file:MultipartBody.Part): Response<List<WriteResponseData>> {
        return nasApiInterface.upload(file)
    }

    suspend fun getWebUrl(): Response<List<WebUrlResponse>>{
        return nasApiInterface.getWebUrl()
    }
}