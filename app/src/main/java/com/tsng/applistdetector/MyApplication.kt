package com.tsng.applistdetector

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context

class MyApplication : Application() {
    companion object {
        @SuppressLint("StaticFieldLeak")
        lateinit var appContext: Context
        lateinit var detectionAppList: List<String>
        lateinit var accList: List<String>
        var accenable:Boolean = false
    }

    init {
        System.loadLibrary("native")
    }

    override fun onCreate() {
        super.onCreate()
        appContext = applicationContext
    }
}