package com.kimdoori.githubapp.data.di

import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import io.reactivex.rxjava3.schedulers.Schedulers
import javax.inject.Singleton
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.adapter.rxjava3.RxJava3CallAdapterFactory
import retrofit2.converter.moshi.MoshiConverterFactory

@Module
@InstallIn(SingletonComponent::class)
class NetworkModule {

    @Provides
    @Singleton
    fun providesOkHttpClient(): OkHttpClient = OkHttpClient.Builder().build()

    @Provides
    @Singleton
    fun providesMoshiConverterFactory(): MoshiConverterFactory =
        MoshiConverterFactory.create(
            Moshi
                .Builder()
                .addLast(KotlinJsonAdapterFactory())
                .build()
        )

    @Provides
    @Singleton
    fun providesRxJava3CallAdapterFactory(): RxJava3CallAdapterFactory =
        RxJava3CallAdapterFactory.createWithScheduler(Schedulers.io())

    @Provides
    @Singleton
    fun providesRetrofit(
        moshiConverterFactory: MoshiConverterFactory,
        rxJava3CallAdapterFactory: RxJava3CallAdapterFactory,
        okHttpClient: OkHttpClient
    ): Retrofit = Retrofit.Builder()
        .baseUrl(GITHUB_API_BASE_URL)
        .addConverterFactory(moshiConverterFactory)
        .addCallAdapterFactory(rxJava3CallAdapterFactory)
        .client(okHttpClient)
        .build()

    companion object {
        private const val GITHUB_API_BASE_URL = "https://api.github.com/"
    }
}
