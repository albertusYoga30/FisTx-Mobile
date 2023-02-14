package com.fistxindonesia.data.network

import com.fistxindonesia.models.banners.BannerResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Headers

interface BannerService {

    @Headers("@: Auth")
    @GET("api/v1/banners")
    suspend fun getBanner(): Response<List<BannerResponse>>

}