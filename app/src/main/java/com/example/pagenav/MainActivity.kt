package com.example.pagenav

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val emojiTextView =findViewById<TextView>(R.id.emoji)
        val unicode = 0x1F614

        val emoji = String(Character.toChars(unicode))
        emojiTextView.text = emoji
    }

    fun toggleEmoji(v: View){
        val emojiTextView = findViewById<TextView>(R.id.emoji)
        val responseTextView = findViewById<TextView>(R.id.responseText)
        val button = findViewById<Button>(R.id.eatCookieButton)
        val hungry = String(Character.toChars(0x1F614))
        val full = String(Character.toChars(0x1F60C))

        if(emojiTextView.text == hungry) {
            emojiTextView.text = full
            responseTextView.text = "I'm so full"
            button.text = "DONE"
        }
        else {
            emojiTextView.text = hungry
            responseTextView.text = "I'm so hungry"
            button.text = "EAT COOKIE"
        }
    }

}