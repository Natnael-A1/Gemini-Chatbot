package com.example.geminiDemo.viewModel

import android.graphics.Bitmap

sealed class ChatClickListener {
    data class UpdatePrompt(val newPrompt: String) : ChatClickListener()
    data class SendPrompt(
        val prompt: String,
        val bitmap: Bitmap?
    ) : ChatClickListener()
}