package com.example.a21game

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun klik (view: View ){
        val intent = Intent(this, Game_Activity::class.java)
        startActivity(intent)
        MainActivity().onDestroy()

    }

    fun nasiloynanir(view: View){
        val builder = AlertDialog.Builder(this)
        builder.setTitle("Nasıl Oynanır?")
        builder.setMessage("- Elinizdeki kartı yukardan sayı seçerek 0 ile 21" +
                " arasında tutmaya çalışmalısınız. \n - Her kart destesinde 3 adet kart bulunmaktadır." +
                "\n - Toplam 9 kart seçerek 0 ile 21 arasında kalırsanız oyunu kazanırsınız.. ")
        builder.setPositiveButton(android.R.string.yes) { dialog, which ->
        }
        builder.show()
    }

}