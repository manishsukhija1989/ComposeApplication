package com.manish.composeapplication.ui.activity

import android.app.Application
import android.content.Context

class ComposeApplication : Application() {
    private var context: Context? = null

    override fun onCreate() {
        super.onCreate()
        context = this
        //This is a comment added to test git changes
    }

    fun getAppComposeContext(): Context? {
        return context
    }

}