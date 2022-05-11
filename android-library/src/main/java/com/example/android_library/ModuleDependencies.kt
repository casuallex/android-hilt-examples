package com.example.android_library

import android.content.Context
import com.example.library.DataSource
import com.example.library.StringClass
import dagger.Provides
import dagger.hilt.EntryPoint
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@EntryPoint
@InstallIn(SingletonComponent::class)
interface ModuleDependencies {

    fun stringClass(): StringClass

//    fun provideDataSource() = DataSource()
}