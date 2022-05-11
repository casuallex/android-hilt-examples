package com.example.library

import javax.inject.Singleton

@Singleton
class StringClass(val hahaha: String) {

    override fun toString(): String {
        return "$hahaha + ${super.toString()}"
    }
}
