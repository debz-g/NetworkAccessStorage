package dev.redfox.networkaccessstorage.models

import com.squareup.moshi.Json

data class Verified(
    @field:Json(name = "verified")
    val verified: Boolean
)