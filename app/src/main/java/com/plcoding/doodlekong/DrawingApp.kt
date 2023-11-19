package com.plcoding.doodlekong

import android.app.Application
import dagger.hilt.android.HiltAndroidApp
import timber.log.Timber

/**
 * Created by Abdallah Shehata on 11/19/2023.
 */
@HiltAndroidApp
class DrawingApp : Application() {
    override fun onCreate() {
        super.onCreate()
        Timber.plant(Timber.DebugTree())
    }
}