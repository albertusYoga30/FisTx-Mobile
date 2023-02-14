package com.fistxindonesia.models.auth.register

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class RegisterResponse(
    @SerializedName("expires_in") val expiresIn: String,
    @SerializedName("message") val message: String,
): Parcelable
