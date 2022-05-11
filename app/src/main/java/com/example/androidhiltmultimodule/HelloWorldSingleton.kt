package com.example.androidhiltmultimodule

import android.content.Context
import android.util.Log
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class HelloWorldSingleton @Inject constructor(val context: Context) {
    init {
        Log.d("helloworldsingleton","hello world inited $this")
    }

    fun getString(): String {
        Log.d("helloworldsingleton","hello world get string $this")
        return "$context + hihihi"
    }
}