package com.example.daggerscopes

import dagger.Module
import dagger.Provides

@Module
class ChatModule {
    @Provides
    @ChatScope
    fun provideChatRepository(): ChatRepository = ChatRepositoryImpl()
}