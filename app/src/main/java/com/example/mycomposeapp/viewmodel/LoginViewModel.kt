package com.example.mycomposeapp.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.mycomposeapp.model.request.LoginModelDto
import com.example.mycomposeapp.repository.CatRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class LoginViewModel @Inject constructor(
    private val repository: CatRepository
)  : ViewModel() {

    fun loginUser(email: String, pwd: String) {

        viewModelScope.launch {
            try {
                var loginModelDto = LoginModelDto()
                loginModelDto.email = email
                loginModelDto.password = pwd
                loginModelDto.device_token = "abc"

                val login = repository.loginUser(loginModelDto)

            } catch (e: Exception) {
                e.printStackTrace()
            } finally {
            }
        }
    }
}