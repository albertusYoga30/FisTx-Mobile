package com.fistxindonesia.models.auth.login

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class LoginResponse(
    @SerializedName("expiresIn") val expiresIn: String,
    @SerializedName("token") val token: String
) : Parcelable
