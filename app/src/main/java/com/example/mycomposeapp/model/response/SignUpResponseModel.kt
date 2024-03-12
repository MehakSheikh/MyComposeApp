package com.example.mycomposeapp.model.response

import com.example.mycomposeapp.model.LoginData
import java.io.Serializable


data class SignUpResponseModel(
    var data: LoginData? = null,
    var message: String? = "",
    var statusCode: Int? = 0
): Serializable