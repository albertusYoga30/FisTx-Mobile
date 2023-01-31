package com.fistxindonesia.data.network

import kotlinx.coroutines.Deferred
import okhttp3.MultipartBody
import okhttp3.RequestBody
import okhttp3.Response
import retrofit2.http.Body
import retrofit2.http.POST
import retrofit2.http.Part

interface UserInterface {

    @POST("api/v1/auth/register")
    suspend fun register(
        @Part("telp_number") phoneBody: RequestBody,
        @Part("password") password: RequestBody,
        @Part("retype_password") retypePassword: RequestBody,
        @Part("registration_token") token: RequestBody,
        @Part ktpImage: MultipartBody.Part
    ): Response

//    @POST("api/v1/auth/validate-otp")
//    suspend fun validateOtp(@Body param: OtpBody): Deferred<Response>


}