package com.fistxindonesia.models.auth.register

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize
import kotlinx.parcelize.RawValue
import okhttp3.MultipartBody
import okhttp3.RequestBody
import retrofit2.http.Multipart


@Parcelize
data class RegisterRequest(
    @SerializedName("telp_number") val phoneNumber: @RawValue RequestBody,
    @SerializedName("password") val password: @RawValue RequestBody,
    @SerializedName("retype_password") val retypePassword: @RawValue RequestBody,
    @SerializedName("upload_ktp") val uploadKtp: @RawValue MultipartBody.Part,
    @SerializedName("registration_token") val registrationToken: @RawValue RequestBody
) : Parcelable
