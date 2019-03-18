package com.example.daggerscopes

import android.content.Context
import dagger.Component

@Component(modules = [AppModule::class])
interface AppComponent {
    fun getContext(): Context
}