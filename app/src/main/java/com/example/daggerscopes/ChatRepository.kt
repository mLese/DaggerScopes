package com.example.daggerscopes

interface ChatRepository {
    fun getMessages(): List<String>
}