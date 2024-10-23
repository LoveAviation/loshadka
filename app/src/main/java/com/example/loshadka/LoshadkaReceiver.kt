package com.example.loshadka

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent

class LoshadkaReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context?, intent: Intent?) {
        val message = intent?.getStringExtra("message")
        if (message == "Loshadka!") {

            if (context is MainActivity) {
                context.incrementMessageCount()
            }


            Thread.sleep(5000)

            val intentBack = Intent("com.example.SECRET_MESSAGE").apply {
                putExtra("message", "Yozhik!")
                setPackage("com.example.yozhik")
            }
            context?.sendBroadcast(intentBack)
        }
    }
}