package com.mlg.androidloginmodulejetpackcompose

import android.app.Application
import dagger.hilt.android.HiltAndroidApp
import timber.log.Timber

@HiltAndroidApp
class LoginApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        //Timber for easy debugging
        Timber.plant(Timber.DebugTree())
    }
}