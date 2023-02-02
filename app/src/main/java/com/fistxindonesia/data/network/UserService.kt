package com.fistxindonesia.data.network

import com.fistxindonesia.data.models.*
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.POST

interface UserService {
    @POST("api/v1/auth/login")
    suspend fun login(@Body param:LoginRequest): Response<LoginResponse>

    @POST("api/v1/auth/register")
    suspend fun register(@Body param: RegisterRequest): Response<RegisterResponse>

    @POST("api/v1/auth/validate-otp")
    suspend fun validate0tp(@Body param: OtpRequest): Response<OtpResponse>

    @POST("api/v1/auth/forgot-password")
    suspend fun forgotPassword(@Body param: ForgotPasswordData): Response<ForgotPasswordData>

    @POST("api/v1/auth/change-password")
    suspend fun changePassword(@Body param: ChangePasswordData): Response<String>


}