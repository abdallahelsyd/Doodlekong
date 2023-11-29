package com.plcoding.doodlekong.util

/**
 * Created by Abdallah Shehata on 11/20/2023.
 */
sealed class Resource<T>(val data: T? = null, val message: String? = null) {
    class Success<T>(data: T?):Resource<T>(data)
    class Error<T>(message: String,data: T?=null):Resource<T>(data,message)
}