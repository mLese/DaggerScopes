package com.example.daggerscopes

import android.content.Context
import dagger.Component
import dagger.Subcomponent

@Component(dependencies = [AppComponent::class], modules = [ChatModule::class])
@ChatScope
interface ChatComponent {
    fun getContext(): Context
    fun getRepository(): ChatRepository

    fun inject(conversationActivity: ConversationActivity)
    fun inject(selectRecipientActivity: SelectRecipientActivity)
}