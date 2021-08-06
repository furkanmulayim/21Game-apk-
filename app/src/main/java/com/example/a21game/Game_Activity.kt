package com.example.a21game

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_game_.*

class Game_Activity : AppCompatActivity() {

    val list = listOf(-1,1,-2,2,-3,3,-4,4,-5,5,-6,6,-7,7,-8,8,-9,9)
    var sontoplam = 0; var sontoplam2 = 0; var sontoplam3 = 0; var kalan1 = 3; var kalan2 = 3; var kalan3 = 3;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game_)
        MainActivity().finish()
        val numbercard1 = list.random()
        card1.text = numbercard1.toString()
        val numbercard2 = list.random()
        card2.text = numbercard2.toString()
        val numbercard3 = list.random()
        card3.text = numbercard3.toString()
    }

    fun basildi1 (view: View){
        if (kalan1 != 1) {
            card_my.text = (Integer.parseInt(card1.text.toString()) + Integer.parseInt(card_my.text.toString())).toString()
            card1.text = (list.random()).toString()
            sontoplam = Integer.parseInt(card1.text.toString())
            kalan1--
            if (Integer.parseInt(card_my.text.toString()) <= 0 || Integer.parseInt(card_my.text.toString()) >= 21) {
                card_my.setBackgroundColor(0xFFFF0000.toInt())
                card_my.setTextColor(0xFFFFFFFF.toInt())

                val builder = AlertDialog.Builder(this)
                builder.setTitle("K A Y B E T T İ N !")
                builder.setMessage("Ama yeniden deneyerek kazanabilirsin..")
                builder.setPositiveButton(android.R.string.yes) { dialog, which ->
                    val intent = Intent(this, MainActivity::class.java)
                    startActivity(intent)
                    Game_Activity().onDestroy()
                }
                builder.show()
            }
        }else{
            card1.text = "X"
            card_my.text = (sontoplam +Integer.parseInt(card_my.text.toString())).toString()
            if (Integer.parseInt(card_my.text.toString()) <= 0 || Integer.parseInt(card_my.text.toString()) >= 21) {
                card_my.setBackgroundColor(0xFFFF0000.toInt())
                card_my.setTextColor(0xFFFFFFFF.toInt())

                val builder = AlertDialog.Builder(this)
                builder.setTitle("K A Y B E T T İ N !")
                builder.setMessage("Ama yeniden deneyerek kazanabilirsin..")
                builder.setPositiveButton(android.R.string.yes) { dialog, which ->
                    val intent = Intent(this, MainActivity::class.java)
                    startActivity(intent)
                    Game_Activity().onDestroy()
                }
                builder.show()
            }
            card1.isClickable = false
        }
        if (card1.text == "X"){
            if (card2.text == "X"){
                if (card3.text == "X") {
                    if (Integer.parseInt(card_my.text.toString()) >= 0 && Integer.parseInt(card_my.text.toString()) <= 21){
                    val builder = AlertDialog.Builder(this)
                    builder.setTitle("K A Z A N D I N !")
                    builder.setMessage("Ama yeniden deneyerek rekora gidebilirsin..")
                    builder.setPositiveButton(android.R.string.yes) { dialog, which ->
                        val intent = Intent(this, MainActivity::class.java)
                        startActivity(intent)
                        Game_Activity().onDestroy()
                    }
                    builder.show()
                    }
                }
            }
        }
    }

    fun basildi2 (view: View){

        if (kalan2 != 1) {
            card_my.text = (Integer.parseInt(card2.text.toString()) + Integer.parseInt(card_my.text.toString())).toString()
            card2.text = (list.random()).toString()
            sontoplam2 = Integer.parseInt(card2.text.toString())
            kalan2--
            if (Integer.parseInt(card_my.text.toString()) <= 0 || Integer.parseInt(card_my.text.toString()) >= 21) {
                card_my.setBackgroundColor(0xFFFF0000.toInt())
                card_my.setTextColor(0xFFFFFFFF.toInt())

                val builder = AlertDialog.Builder(this)
                builder.setTitle("K A Y B E T T İ N !")
                builder.setMessage("Ama yeniden deneyerek kazanabilirsin..")
                builder.setPositiveButton(android.R.string.yes) { dialog, which ->
                    val intent = Intent(this, MainActivity::class.java)
                    startActivity(intent)
                    Game_Activity().onDestroy()
                }
                builder.show()
            }
        }else{
            card2.text = "X"
            card_my.text = (sontoplam2 +Integer.parseInt(card_my.text.toString())).toString()
            if (Integer.parseInt(card_my.text.toString()) <= 0 || Integer.parseInt(card_my.text.toString()) >= 21) {
                card_my.setBackgroundColor(0xFFFF0000.toInt())
                card_my.setTextColor(0xFFFFFFFF.toInt())

                val builder = AlertDialog.Builder(this)
                builder.setTitle("K A Y B E T T İ N !")
                builder.setMessage("Ama yeniden deneyerek kazanabilirsin..")
                builder.setPositiveButton(android.R.string.yes) { dialog, which ->
                    val intent = Intent(this, MainActivity::class.java)
                    startActivity(intent)
                    Game_Activity().onDestroy()
                }
                builder.show()
            }
            card2.isClickable = false
        }

        if (card1.text == "X"){
            if (card2.text == "X"){
                if (card3.text == "X"){
                    if (Integer.parseInt(card_my.text.toString()) >= 0 && Integer.parseInt(card_my.text.toString()) <= 21) {
                        val builder = AlertDialog.Builder(this)
                        builder.setTitle("K A Z A N D I N !")
                        builder.setMessage("Ama yeniden deneyerek rekora gidebilirsin..")
                        builder.setPositiveButton(android.R.string.yes) { dialog, which ->
                            val intent = Intent(this, MainActivity::class.java)
                            startActivity(intent)
                            Game_Activity().onDestroy()
                        }
                        builder.show()
                    }
                }
            }
        }

    }
    fun basildi3 (view: View){
        if (kalan3 != 1) {
            card_my.text = (Integer.parseInt(card3.text.toString()) + Integer.parseInt(card_my.text.toString())).toString()
            card3.text = (list.random()).toString()
            sontoplam3 = Integer.parseInt(card3.text.toString())
            kalan3--
            if (Integer.parseInt(card_my.text.toString()) <= 0 || Integer.parseInt(card_my.text.toString()) >= 21) {
                card_my.setBackgroundColor(0xFFFF0000.toInt())
                card_my.setTextColor(0xFFFFFFFF.toInt())

                val builder = AlertDialog.Builder(this)
                builder.setTitle("K A Y B E T T İ N !")
                builder.setMessage("Ama yeniden deneyerek kazanabilirsin..")
                builder.setPositiveButton(android.R.string.yes) { dialog, which ->
                    val intent = Intent(this, MainActivity::class.java)
                    startActivity(intent)
                    Game_Activity().onDestroy()
                }
                builder.show()
            }
        }else{
            card3.text = "X"
            card_my.text = (sontoplam3 +Integer.parseInt(card_my.text.toString())).toString()
            if (Integer.parseInt(card_my.text.toString()) <= 0 || Integer.parseInt(card_my.text.toString()) >= 21) {
                card_my.setBackgroundColor(0xFFFF0000.toInt())
                card_my.setTextColor(0xFFFFFFFF.toInt())

                val builder = AlertDialog.Builder(this)
                builder.setTitle("K A Y B E T T İ N !")
                builder.setMessage("Ama yeniden deneyerek kazanabilirsin..")
                builder.setPositiveButton(android.R.string.yes) { dialog, which ->
                    val intent = Intent(this, MainActivity::class.java)
                    startActivity(intent)
                    Game_Activity().onDestroy()
                }
                builder.show()
            }
            card3.isClickable = false
        }
        if (card1.text == "X"){
            if (card2.text == "X"){
                if (card3.text == "X"){
                    if (Integer.parseInt(card_my.text.toString()) >= 0 && Integer.parseInt(card_my.text.toString()) <= 21) {
                        val builder = AlertDialog.Builder(this)
                        builder.setTitle("K A Z A N D I N !")
                        builder.setMessage("Ama yeniden deneyerek rekora gidebilirsin..")
                        builder.setPositiveButton(android.R.string.yes) { dialog, which ->
                            val intent = Intent(this, MainActivity::class.java)
                            startActivity(intent)
                            Game_Activity().onDestroy()
                        }
                        builder.show()
                    }
                }
            }
        }
    }
}
