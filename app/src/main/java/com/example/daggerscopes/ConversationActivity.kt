package com.example.daggerscopes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import javax.inject.Inject

class ConversationActivity : AppCompatActivity() {

    @Inject
    lateinit var chatRepository: ChatRepository

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        (application as DaggerScopeApplication).chatComponent.inject(this)
        setContentView(R.layout.activity_conversation)

        Log.d("repository instance", chatRepository.toString())

        val intent = Intent(this, SelectRecipientActivity::class.java)
        startActivity(intent)
    }
}
