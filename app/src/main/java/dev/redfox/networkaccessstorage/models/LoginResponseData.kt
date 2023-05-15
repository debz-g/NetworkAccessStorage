package dev.redfox.networkaccessstorage.models

import com.squareup.moshi.Json

data class LoginResponseData(
    @field:Json(name = "verified")
    var verified: Boolean? = null
)