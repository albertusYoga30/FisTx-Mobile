package com.fistxindonesia.models.auth.login

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class LoginRequest(
    @SerializedName("telp_number") val phoneNumber: String,
    @SerializedName("password") val password: String,
    @SerializedName("registration_token")val registrationToken: String
) : Parcelable