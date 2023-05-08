package dev.redfox.networkaccessstorage.networking

import retrofit2.http.POST

interface NasApiInterface {

    @POST("login")
    suspend fun login()

    @POST("read")
    suspend fun read()

    @POST("write")
    suspend fun write()
}