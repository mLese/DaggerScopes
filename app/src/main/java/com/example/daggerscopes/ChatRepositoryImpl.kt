package com.example.daggerscopes

class ChatRepositoryImpl: ChatRepository {
    override fun getMessages(): List<String> {
        return listOf("Message 1", "Message 2")
    }
}