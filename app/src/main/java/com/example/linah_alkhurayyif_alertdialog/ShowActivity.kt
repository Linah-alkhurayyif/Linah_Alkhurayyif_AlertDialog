package com.example.linah_alkhurayyif_alertdialog

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_show.*
import kotlinx.android.synthetic.main.alart_message.view.*

class ShowActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_show)
        val message = intent.getStringExtra("message")

        textView.text = message.toString()
        goback.setOnClickListener {
            val intent = Intent(this, MainActivity()::class.java)

            startActivity(intent);
        }
    }
}