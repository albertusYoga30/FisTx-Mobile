package com.fistxindonesia.models.user

import android.graphics.Region
import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize
import kotlinx.parcelize.RawValue
import java.util.*


@Parcelize
data class UserDetail(
    @SerializedName("code") val code: Int,
    @SerializedName("data") val data: @RawValue Data
) : Parcelable  {
    data class Data(
        @SerializedName("address") val address: String,
        @SerializedName("city") val city: City,
        @SerializedName("created_at") val created_at: String,
        @SerializedName("date_of_birth") val date_of_birth: Date,
        @SerializedName("deleted_at") val deleted_at: Any,
        @SerializedName("email") val email: String,
        @SerializedName("id") val id: String,
        @SerializedName("id_city") val id_city: Int,
        @SerializedName("id_province") val id_province: Int,
        @SerializedName("id_region") val id_region: Int,
        @SerializedName("id_user_status") val id_user_status: Int,
        @SerializedName("ktp_number") val ktp_number: String,
        @SerializedName("place_of_birth") val place_of_birth: String,
        @SerializedName("province") val province: Province,
        @SerializedName("region") val region: Region,
        @SerializedName("sub_region") val sub_region: String,
        @SerializedName("telp_number") val telp_number: String,
        @SerializedName("updated_at") val updated_at: String,
        @SerializedName("upload_ktp") val upload_ktp: String,
        @SerializedName("user_name") val user_name: String,
        @SerializedName("user_status") val user_status: UserStatus
    ) {
        data class City(
            @SerializedName("city_name") val city_name: String,
            @SerializedName("created_at") val created_at: String,
            @SerializedName("deleted_at") val deleted_at: Any,
            @SerializedName("id") val id: Int,
            @SerializedName("id_province") val id_province: String,
            @SerializedName("updated_at") val updated_at: String
        )

        data class Province(
            @SerializedName("created_at") val created_at: String,
            @SerializedName("deleted_at") val deleted_at: Any,
            @SerializedName("id") val id: Int,
            @SerializedName("province_name") val province_name: String,
            @SerializedName("updated_at") val updated_at: String
        )

        data class Region(
            @SerializedName("created_at") val created_at: String,
            @SerializedName("deleted_at") val deleted_at: Any,
            @SerializedName("id") val id: Int,
            @SerializedName("id_city") val id_city: String,
            @SerializedName("region_name") val region_name: String,
            @SerializedName("updated_at") val updated_at: String
        )

        data class UserStatus(
            @SerializedName("created_at") val created_at: String,
            @SerializedName("deleted_at") val deleted_at: Any,
            @SerializedName("id") val id: Int,
            @SerializedName("status") val status: String,
            @SerializedName("updated_at") val updated_at: String
        )
    }

}
