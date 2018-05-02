package com.example.dga_g.myapplication

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var valorTextoCentral=texto_central.text;
        //Log.i("clase", "El texto que se muestra antes es ${texto_central.text} o $valorTextoCentral")
//        texto_central.text="Nuevo Hola Mundo!"
        valorTextoCentral=texto_central.text;
        //Log.i("clase", "El texto que se muestra despues es ${texto_central.text} o $valorTextoCentral")

        Log.e("clase", "esto es un error")
        Log.w("clase", "esto es un warning")
        Log.d("clase", "esto es un debug")
        Log.i("clase", "esto es un info")
        Log.v("clase", "esto es un verbose")

        //code
        btn_actividad_2.setOnClickListener {
            v: View? ->  irActividadDos()
        }

    }

    fun irActividadDos(){
        val intent = Intent(this, Main2Activity::class.java )
        //pasar parametros a otra actividad
        intent.putExtra("llave","valor")
        startActivity(intent)
    }
}