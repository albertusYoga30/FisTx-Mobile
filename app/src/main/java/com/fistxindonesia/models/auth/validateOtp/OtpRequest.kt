package com.fistxindonesia.models.auth.validateOtp

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class OtpRequest(
    @SerializedName("otp_code")
    val otpCode: String
): Parcelable
