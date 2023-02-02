package com.fistxindonesia.data.models

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class LoginRequest(
    @SerializedName("telp_number")
    val telp_number: String,
    @SerializedName("password")
    val password: String,
    @SerializedName("registration_token")
    val registration_token: String = ""
) : Parcelable

@Parcelize
data class LoginResponse(
    @SerializedName("expiresIn")
    val expiresIn: String,
    @SerializedName("token")
    val token: String
) : Parcelable

@Parcelize
data class RegisterRequest(
    @SerializedName("telp_number") val phoneNumber: String,
    @SerializedName("password") val password: String,
    @SerializedName("retype_password") val retypePassword: String,
    @SerializedName("upload_ktp") val uploadKtp: String = "/D:/smile-mouth-png-5a3a487e768f69.6543543315137690864856.jpg",
    @SerializedName("registration_token") val registrationToken: String
) : Parcelable

@Parcelize
data class RegisterResponse(
    @SerializedName("expires_in") val expiresIn: String,
    @SerializedName("message") val message: String,
) : Parcelable

@Parcelize
data class OtpRequest(
    @SerializedName("otp_code")
    val otpCode: String
) : Parcelable

@Parcelize
data class OtpResponse(
    @SerializedName("code")
    val code: Int,
    @SerializedName("message")
    val message: String,
    @SerializedName("status")
    val status: String,
) : Parcelable

@Parcelize
data class ForgotPasswordData(
    @SerializedName("telp_number") val phoneNumber: String
) : Parcelable

@Parcelize
data class ChangePasswordData(
    @SerializedName("telp_number") val phoneNumber: String,
    @SerializedName("otp_code") val otpCode: String,
    @SerializedName("password") val password: String,
) : Parcelable








