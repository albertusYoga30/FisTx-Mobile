package com.fistxindonesia.data.network

import com.fistxindonesia.models.user.UpdateUserResponse
import com.fistxindonesia.models.user.UserDetail
import okhttp3.RequestBody
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.PUT

interface UserService {

    @Headers("@: Auth")
    @GET("api/v1/breeders/detail")
    suspend fun getUserDetail() : UserDetail

    @Headers("@: Auth")
    @PUT("api/v1/breeders")
    suspend fun updateUserProfile(@Body param :RequestBody): UpdateUserResponse

}