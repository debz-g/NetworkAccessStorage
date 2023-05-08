package dev.redfox.networkaccessstorage.networking

import dev.redfox.networkaccessstorage.models.LoginResponseData
import dev.redfox.networkaccessstorage.models.WriteResponseData
import okhttp3.MultipartBody
import okhttp3.RequestBody
import retrofit2.Response
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.Multipart
import retrofit2.http.POST
import retrofit2.http.Part

interface NasApiInterface {

    @FormUrlEncoded
    @POST("login") // send username and password
    suspend fun loginApi(
        @Field("email") email: String,
        @Field("password") password: String
    ): Response<List<LoginResponseData>>

    @POST("read")
    suspend fun read()

    @Multipart
    @POST("write")
    suspend fun upload(
        @Part productImage: MultipartBody.Part
    ): Response<List<WriteResponseData>>
}