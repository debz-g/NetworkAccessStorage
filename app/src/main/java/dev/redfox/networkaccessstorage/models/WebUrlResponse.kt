package dev.redfox.networkaccessstorage.models


import com.squareup.moshi.Json

data class WebUrlResponse(
    @field:Json(name = "readLink")
    var readLink: String? = null
)