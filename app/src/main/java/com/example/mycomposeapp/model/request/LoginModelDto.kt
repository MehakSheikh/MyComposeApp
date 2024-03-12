package com.example.mycomposeapp.model.request

data class LoginModelDto(
    var email:String?="",
    var password:String?="",
    var device_token:String?=""
)
