package com.example.mycomposeapp.model.request

import android.os.Parcelable

data class SignUpModelDto(
    var email: String?,
    var password: String?,
    var confirm_password: String?,
    var firstName: String?,
    var lastName: String?,
    var picture: String?,
    var role: String?,
    var phoneNumber: String?,
    var notification: Boolean?,
    var device_token: String?,
    var ref: String?,
    var social_login: Boolean?
)
