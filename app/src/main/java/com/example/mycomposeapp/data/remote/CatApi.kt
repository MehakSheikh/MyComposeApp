package com.example.mycomposeapp.data.remote

import com.example.mycomposeapp.model.request.LoginModelDto
import com.example.mycomposeapp.model.response.LoginResponseModelDto
import com.example.mycomposeapp.model.request.SignUpModelDto
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST

interface CatApi {
    @POST("app/user/userlogin")
    suspend fun login(@Body model: LoginModelDto) : Call<LoginResponseModelDto>

    @POST("app/user/register")
    suspend fun signUp(@Body model: SignUpModelDto) : Call<LoginResponseModelDto>


//    @POST("app/user/register")
//    fun SignUp(@Body model: SignUpModel): Call<SignUpResponse>
}