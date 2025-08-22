package com.manish.composeapplication.ui.activity

import android.app.Application
import android.content.Context

class ComposeApplication : Application() {
    private var context: Context? = null

    override fun onCreate() {
        super.onCreate()
        context = this
    }

    fun getAppComposeContext(): Context? {
        return context
    }

}