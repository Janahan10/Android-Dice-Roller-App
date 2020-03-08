package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import java.util.*

class MainActivity : AppCompatActivity() {

    // lateinit keyword: promises that the variable will not be left as null and will given a value
    lateinit var diceImage: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) // sets up layout for app

        val rollButton: Button = findViewById(R.id.roll_button) // gets the button by id
        rollButton.setOnClickListener{
            // calls the function to roll dice on button click
            rollDice()
        }
        diceImage = findViewById(R.id.dice_image)
    }

    private fun rollDice() {

        // generate random integer for dice value
        val randomInt = Random().nextInt(6) + 1

        // checks what random number was generated and displays a picture of that value on the screen
        val drawableResource = when (randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            6 -> R.drawable.dice_6
            else -> R.drawable.dice_1
        }

        // sets image onto the image view element
        diceImage.setImageResource(drawableResource)

    }
}
