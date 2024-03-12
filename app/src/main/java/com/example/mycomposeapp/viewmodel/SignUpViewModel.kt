package com.example.mycomposeapp.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.mycomposeapp.model.request.SignUpModelDto
import com.example.mycomposeapp.repository.CatRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class SignUpViewModel @Inject constructor(
    private val repository: CatRepository
)  : ViewModel() {

    fun signUpUser(email: String,userName: String, pwd: String, confirmPwd: String) {

        viewModelScope.launch {
            try {
                var signModelDto = SignUpModelDto()
                signModelDto.email = email
                signModelDto.userName = userName
                signModelDto.password = pwd
                signModelDto.confirmPwd = confirmPwd

                val signUp = repository.signUpUser(signModelDto)

            } catch (e: Exception) {
                e.printStackTrace()
            } finally {
            }
        }
    }
}