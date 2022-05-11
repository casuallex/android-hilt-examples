package com.example.android_library

import android.content.Context
import dagger.BindsInstance
import dagger.Component

@Component(dependencies = [ModuleDependencies::class])
interface ModuleComponent {

    fun inject(activity: MainActivity3)

    @Component.Builder
    interface Builder {
        fun context(@BindsInstance context: Context): Builder
        fun appDependencies(componDependencies: ModuleDependencies): Builder
        fun build(): ModuleComponent
    }
}