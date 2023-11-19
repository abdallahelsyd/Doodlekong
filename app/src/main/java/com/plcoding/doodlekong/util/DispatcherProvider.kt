package com.plcoding.doodlekong.util

import kotlinx.coroutines.CoroutineDispatcher

/**
 * Created by Abdallah Shehata on 11/19/2023.
 */
interface DispatcherProvider {
    val main :CoroutineDispatcher
    val io:CoroutineDispatcher
    val default:CoroutineDispatcher
}