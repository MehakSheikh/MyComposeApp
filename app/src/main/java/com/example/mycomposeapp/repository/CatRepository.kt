package com.example.mycomposeapp.repository

import com.example.mycomposeapp.data.remote.CatApi
import com.example.mycomposeapp.model.request.LoginModelDto
import com.example.mycomposeapp.model.request.SignUpModelDto
import javax.inject.Inject

class CatRepository @Inject constructor(private val catApi: CatApi) {

    suspend fun loginUser(loginModelDto: LoginModelDto){
        val login = catApi.login(loginModelDto)
    }

    suspend fun signUpUser(signUpModelDto: SignUpModelDto){
        val signUp = catApi.signUp(signUpModelDto)
    }
}