package com.example.linah_alkhurayyif_alertdialog

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.alart_message.view.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        showbutton.setOnClickListener {
            showAlart()
        }
    }

    fun showAlart() {
        //Inflate the dialog as custom view
        val messageBoxView = LayoutInflater.from(this).inflate(R.layout.alart_message, null)

        //AlertDialogBuilder
        val messageBoxBuilder = AlertDialog.Builder(this).setView(messageBoxView)

        //show dialog
        val  messageBoxInstance = messageBoxBuilder.show()

        messageBoxView.cancel.setOnClickListener(){
            messageBoxInstance.dismiss()
        }
        messageBoxView.show.setOnClickListener(){
            messageBoxView.message_tv.text = messageBoxView.userinput.text.toString()
        }
        messageBoxView.go.setOnClickListener(){
            val intent = Intent(this, ShowActivity()::class.java)
            intent.putExtra("message",messageBoxView.userinput.text.toString())
            startActivity(intent);
        }

    }
}