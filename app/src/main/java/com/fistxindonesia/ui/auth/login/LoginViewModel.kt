package com.fistxindonesia.ui.auth.login

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class LoginViewModel @Inject constructor(
    application: Application
) : AndroidViewModel(application) {

    val isButtonEnable: MutableLiveData<Boolean> = MutableLiveData(false)

    private var phoneNumber: String = ""
    private var password: String = ""

    fun inputPhoneNumber(phoneNumber: String) {
        this.phoneNumber = phoneNumber
        validateInput()
    }

    fun inputPassword(password: String) {
        this.password = password
        validateInput()
    }

    private fun validateInput() {
        isButtonEnable.value = phoneNumber.isNotEmpty() && password.isNotEmpty()
    }

//    fun doLogin(){
//        CoroutineScope(Dispatchers.IO).launch {
//            val request = LoginRequest(
//                phoneNumber = phoneNumber,
//                password = password,
//                registrationToken = REGISTRATION_TOKEN
//            )
//        }
//    }
}