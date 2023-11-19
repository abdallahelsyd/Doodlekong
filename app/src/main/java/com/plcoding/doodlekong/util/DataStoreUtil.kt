package com.plcoding.doodlekong.util

import android.content.Context
import androidx.datastore.preferences.preferencesDataStore

/**
 * Created by Abdallah Shehata on 11/19/2023.
 */

val Context.dataStore by preferencesDataStore("settings")