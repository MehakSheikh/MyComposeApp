package com.example.mycomposeapp.model
import java.io.Serializable

data class LoginData(
    var notification:Boolean?=false,
    var active:Boolean?=false,
    var _id:String?="",
    var verification:Boolean?=false,
    var email: String? = "",
    var firstName:String?="",
    var lastName:String?="",
    var picture:String?="",
    var phoneNumber:String?="",
    var role:String?="",
    var device_token:String?="",
    var token:String?="",
    var seed: Boolean? = false,
    var description:String ?= "",
    var reset_code:String ?=  "",
    var reset_code_expiry:String ?="",
    var title:String ?= "",
    var video:String ?= "",
    var socialLogin:Boolean ?= false,
    var tour_done:Boolean ?= false,
    var review_done:Boolean ?= false
): Serializable

//object LoginDataSerializer {
//    private val json = Json { ignoreUnknownKeys = true }
//
//    fun serialize(data: LoginData): String {
//        return json.encodeToString(data)
//    }
//
//    fun deserialize(jsonString: String): LoginData {
//        return json.decodeFromString(LoginData.serialize(),jsonString)
//    }
//}
