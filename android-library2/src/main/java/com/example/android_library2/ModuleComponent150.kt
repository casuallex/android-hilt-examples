package com.example.android_library2

import android.content.Context
import dagger.BindsInstance
import dagger.Component

@Component(dependencies = [ModuleDependencies150::class])
interface ModuleComponent150 {

    fun inject(activity: MainActivity4)

    @Component.Builder
    interface Builder {
        fun context(@BindsInstance context: Context): Builder
        fun appDependencies(componDependencies: ModuleDependencies150): Builder
        fun build(): ModuleComponent150
    }
}