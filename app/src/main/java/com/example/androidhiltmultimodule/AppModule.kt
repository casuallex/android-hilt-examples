package com.example.androidhiltmultimodule

import android.content.Context
import com.example.library.DataSource
import com.example.library.StringClass
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class AppModule {

    @Singleton
    @Provides
    fun provideContext(@ApplicationContext context: Context) = context


    @Singleton
    @Provides
    fun provideString() = StringClass("asd")

}