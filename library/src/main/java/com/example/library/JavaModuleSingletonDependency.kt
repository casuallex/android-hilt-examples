package com.example.library

import javax.inject.Inject
import javax.inject.Singleton
import javax.naming.Context

class JavaModuleSingletonDependency @Inject constructor( val someStringClass: StringClass) {
    init {
    }

    fun getString(): String {
        return "$someStringClass + hihihi + $this"
    }
}