package com.example.testovoe24

import android.app.Application
import com.onesignal.OneSignal

const val ONESIGNAL_APP_ID = "eaf3111c-a4ea-433a-bee9-15115c3fd739"

class ApplicationClass : Application() {
    override fun onCreate() {
        super.onCreate()

        // Logging set to help debug issues, remove before releasing your app.
        OneSignal.setLogLevel(OneSignal.LOG_LEVEL.VERBOSE, OneSignal.LOG_LEVEL.NONE)

        // OneSignal Initialization
        OneSignal.initWithContext(this)
        OneSignal.setAppId(ONESIGNAL_APP_ID)
    }
}