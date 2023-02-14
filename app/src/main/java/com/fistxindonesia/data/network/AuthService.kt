package com.fistxindonesia.data.network

import com.fistxindonesia.models.auth.changePassword.ChangePasswordRequest
import com.fistxindonesia.models.auth.forgotPassword.ForgotPasswordData
import com.fistxindonesia.models.auth.login.LoginRequest
import com.fistxindonesia.models.auth.login.LoginResponse
import com.fistxindonesia.models.auth.register.RegisterRequest
import com.fistxindonesia.models.auth.register.RegisterResponse
import com.fistxindonesia.models.auth.validateOtp.OtpRequest
import com.fistxindonesia.models.auth.validateOtp.OtpResponse
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.POST

interface AuthService {
    @POST("api/v1/auth/login")
    suspend fun login(@Body param: LoginRequest): Response<LoginResponse>

    @POST("api/v1/auth/register")
    suspend fun register(@Body param: RegisterRequest): Response<RegisterResponse>

    @POST("api/v1/auth/validate-otp")
    suspend fun validate0tp(@Body param: OtpRequest): Response<OtpResponse>

    @POST("api/v1/auth/forgot-password")
    suspend fun forgotPassword(@Body param: ForgotPasswordData): Response<ForgotPasswordData>

    @POST("api/v1/auth/change-password")
    suspend fun changePassword(@Body param: ChangePasswordRequest): Response<String>

}