package com.example.android_library

import android.content.Intent
import android.os.Bundle
import android.util.Log
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import com.example.android_library.databinding.ActivityMain3Binding
import com.example.android_library2.MainActivity4
import com.example.library.DataSource
import com.example.library.JavaModuleSingletonDependency
import dagger.hilt.android.AndroidEntryPoint
import dagger.hilt.android.EntryPointAccessors
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity3 : AppCompatActivity() {


    @Inject
    lateinit var dependency3: JavaModuleSingletonDependency

//    @Inject
//    lateinit var dataSource: DataSource

    override fun onCreate(savedInstanceState: Bundle?) {
        DaggerModuleComponent.builder()
        .context(this)
        .appDependencies(
            EntryPointAccessors.fromApplication(
                applicationContext,
                ModuleDependencies::class.java
            )
        )
        .build()
        .inject(this)

        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main3)
        Log.e("MainActivity3",dependency3.getString())
//        Log.e("MainActivity3",dataSource.toString())
        startActivity(Intent(this, MainActivity4::class.java))

    }

}