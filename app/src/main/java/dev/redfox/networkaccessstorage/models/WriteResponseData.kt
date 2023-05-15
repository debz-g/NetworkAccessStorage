package dev.redfox.networkaccessstorage.models

import com.squareup.moshi.Json

class WriteResponseData {
    @field:Json(name = "status")
    var status: Boolean? = null
}