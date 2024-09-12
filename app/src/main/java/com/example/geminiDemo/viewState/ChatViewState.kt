package com.example.geminiDemo.viewState

import android.graphics.Bitmap
import com.example.geminiDemo.data.Chat

data class ChatViewState(
    val chatBotList: List<Chat> = emptyList(),
    val prompt: String = "",
    val bitmap: Bitmap? = null
)
