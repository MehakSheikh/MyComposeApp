package com.example.mycomposeapp.model.response

import com.example.mycomposeapp.model.LoginData

data class LoginResponseModelDto(
    var data: LoginData? = null,
    var message: String? = "",
    var statusCode: Int? = 0
)
