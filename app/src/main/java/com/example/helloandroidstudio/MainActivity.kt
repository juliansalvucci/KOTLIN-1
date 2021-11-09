package com.example.helloandroidstudio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.speech.tts.TextToSpeech
import android.util.Log
import android.widget.Button
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity(), TextToSpeech.OnInitListener {

    var tts: TextToSpeech? = null  //variable local del tipo TextToSpeech

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) //vistas

        tts = TextToSpeech(this,this) //contexto = misma actividad, listener que debe ser compatible con la interface TextToSpeech

        findViewById<Button>(R.id.btnPlay).setOnClickListener{speak()}

    }

    private fun speak(){
        var message: String = findViewById<TextView>(R.id.textView).text.toString() //extraigo el id de la vista

        tts!!.speak(message, TextToSpeech.QUEUE_FLUSH, null, "")
    }

    override fun onInit(status: Int) {  //Método que pregunta si el movil esta habilitado para hablar
        if(status == TextToSpeech.SUCCESS){
            findViewById<TextView>(R.id.textView).text = "Listo"
            tts!!.language = Locale.CHINA
        } else {
            findViewById<TextView>(R.id.textView).text = "No disponible"
        }

    }
}
