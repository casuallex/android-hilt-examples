package com.example.androidhiltmultimodule

import android.content.Context
import android.util.Log
import javax.inject.Inject
import javax.inject.Singleton

class HelloWorldDependency @Inject constructor(val context: Context) {
    init {
        Log.d("helloworlddependency","hello world inited $this")
    }

    fun getString(): String {
        Log.d("helloworlddependency","hello world get string $this")
        return "$context + hihihi"
    }
}