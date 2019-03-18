package com.example.daggerscopes

import android.app.Application

class DaggerScopeApplication: Application() {

    lateinit var appComponent: AppComponent
    lateinit var chatComponent: ChatComponent

    override fun onCreate() {
        super.onCreate()

        appComponent = DaggerAppComponent.builder().appModule(AppModule(this)).build()
        chatComponent = DaggerChatComponent.builder().appComponent(appComponent).build()
    }
}