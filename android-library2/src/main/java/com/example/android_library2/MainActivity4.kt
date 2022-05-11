package com.example.android_library2

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.library.DataSource
import com.example.library.JavaModuleSingletonDependency
import dagger.hilt.android.AndroidEntryPoint
import dagger.hilt.android.EntryPointAccessors
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity4 : AppCompatActivity() {


    @Inject
    lateinit var dependency3: JavaModuleSingletonDependency

//    @Inject
//    lateinit var dataSource: DataSource

    override fun onCreate(savedInstanceState: Bundle?) {
        DaggerModuleComponent150.builder()
        .context(this)
        .appDependencies(
            EntryPointAccessors.fromApplication(
                applicationContext,
                ModuleDependencies150::class.java
            )
        )
        .build()
        .inject(this)

        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main4)
        Log.e("MainActivity4",dependency3.getString())
//        Log.e("MainActivity4",dataSource.toString())
    }

}