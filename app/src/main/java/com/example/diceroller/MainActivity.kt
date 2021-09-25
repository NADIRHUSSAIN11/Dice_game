package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton:Button=findViewById(R.id.button)

        rollButton.setOnClickListener {
            function()
        }


    }

    private fun function() {
        val dice=Dice(6)
        val diceRoll=dice.roll()
        val diceImage:ImageView=findViewById(R.id.imageView)
        val resource=when(diceRoll){
            1->R.drawable.dice_1
            2->R.drawable.dice_2
            3->R.drawable.dice_3
            4->R.drawable.dice_4
            5->R.drawable.dice_5
            else->R.drawable.dice_6

        }
        diceImage.setImageResource(resource)
        diceImage.contentDescription=diceRoll.toString()
    }
}

class Dice(val diceSides:Int){

       fun roll():Int{
           return (1..diceSides).random()
       }

    }



