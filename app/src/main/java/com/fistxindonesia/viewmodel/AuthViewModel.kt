package com.fistxindonesia.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class AuthViewModel : ViewModel() {
    val isButtonEnable: MutableLiveData<Boolean> = MutableLiveData(false)

    fun validatePin(pin1: String, pin2: String, pin3: String, pin4: String, pin5: String) {
        isButtonEnable.value =
            pin1.isNotEmpty() && pin2.isNotEmpty() && pin3.isNotEmpty() && pin4.isNotEmpty() && pin5.isNotEmpty()
    }

    fun register(phone: String, password: String, retypePassword: String, ktpFile: String ){

    }

}

