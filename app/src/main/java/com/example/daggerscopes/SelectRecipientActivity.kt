package com.example.daggerscopes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import javax.inject.Inject

class SelectRecipientActivity : AppCompatActivity() {

    @Inject
    lateinit var chatRepository: ChatRepository

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        (application as DaggerScopeApplication).chatComponent.inject(this)
        setContentView(R.layout.activity_select_recipient)

        Log.d("repository instance", chatRepository.toString())
    }
}
