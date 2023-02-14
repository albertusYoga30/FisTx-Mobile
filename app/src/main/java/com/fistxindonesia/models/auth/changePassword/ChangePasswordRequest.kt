package com.fistxindonesia.models.auth.changePassword

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class ChangePasswordRequest(
    @SerializedName("telp_number") val phoneNumber: String,
    @SerializedName("otp_code") val otpCode: String,
    @SerializedName("password") val password: String,
) : Parcelable
