package com.example.myfirstappproject.di

import com.example.myfirstappproject.data.network.ActivityApiClient
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {
    private const val BASE_URL = "https://www.boredapi.com/api/"

    @Singleton
    @Provides
    fun providesRetrofit (): Retrofit = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    @Singleton
    @Provides
    fun providesActivityApiClient (retrofit: Retrofit) : ActivityApiClient =
        retrofit.create(ActivityApiClient::class.java)



}