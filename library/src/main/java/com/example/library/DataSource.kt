package com.example.library

import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class DataSource @Inject constructor() {
    override fun toString(): String {
        return "DataSource() ${super.toString()}"
    }
}