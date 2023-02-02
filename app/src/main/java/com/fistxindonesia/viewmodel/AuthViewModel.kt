package com.fistxindonesia.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.fistxindonesia.data.network.UserService
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.CoroutineScope
import javax.inject.Inject

@HiltViewModel
class AuthViewModel @Inject constructor(
    private val userService: UserService,
    application: Application
) : AndroidViewModel(application) {
    val isButtonEnable: MutableLiveData<Boolean> = MutableLiveData(false)

    fun register(phoneNumber: String, password: String, retypePassword: String) {


    }


}

