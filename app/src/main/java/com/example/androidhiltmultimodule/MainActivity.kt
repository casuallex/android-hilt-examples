package com.example.androidhiltmultimodule

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.library.JavaModuleSingletonDependency
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var dependency1: HelloWorldDependency
    @Inject
    lateinit var dependency2: HelloWorldSingleton
    @Inject
    lateinit var dependency3: JavaModuleSingletonDependency

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.e("MainActivity",dependency1.getString())
        Log.e("MainActivity",dependency2.getString())
        Log.e("MainActivity",dependency3.getString())
        startActivity(Intent(this,MainActivity2::class.java))
    }
}