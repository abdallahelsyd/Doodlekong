package com.plcoding.doodlekong.di

import com.google.gson.Gson
import com.plcoding.doodlekong.data.remote.api.SetupApi
import com.plcoding.doodlekong.util.Constants.HTTP_BASE_URL
import com.plcoding.doodlekong.util.Constants.HTTP_BASE_URL_LOCALHOST
import com.plcoding.doodlekong.util.Constants.USE_LOCALHOST
import com.plcoding.doodlekong.util.DispatcherProvider
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

/**
 * Created by Abdallah Shehata on 11/19/2023.
 */
@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    @Provides
    @Singleton
    fun provideOkHttpClient():OkHttpClient{
        return OkHttpClient()
            .newBuilder().addInterceptor(HttpLoggingInterceptor().apply {
                level=HttpLoggingInterceptor.Level.BODY
            })
            .build()
    }

    @Provides
    @Singleton
    fun provideGsonInstance():Gson{
        return Gson()
    }


    @Singleton
    @Provides
    fun provideSetupApi(okHttpClient: OkHttpClient):SetupApi{
        return Retrofit.Builder()
            .baseUrl(if(USE_LOCALHOST) HTTP_BASE_URL_LOCALHOST else HTTP_BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .client(okHttpClient)
            .build()
            .create(SetupApi::class.java)
    }

    @Singleton
    @Provides
    fun provideDispatcherProvider():DispatcherProvider{
        return object :DispatcherProvider{
            override val main: CoroutineDispatcher
                get() = Dispatchers.Main
            override val io: CoroutineDispatcher
                get() = Dispatchers.IO
            override val default: CoroutineDispatcher
                get() = Dispatchers.Default

        }
    }
}