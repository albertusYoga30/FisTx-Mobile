package com.fistxindonesia.models.auth.forgotPassword

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class ForgotPasswordData(
    @SerializedName("telp_number") val phoneNumber: String
): Parcelable
