package com.fistxindonesia.models.user

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class UpdateUserResponse(
    @SerializedName("status") val status: String,
    @SerializedName("code") val code: Int
) : Parcelable
