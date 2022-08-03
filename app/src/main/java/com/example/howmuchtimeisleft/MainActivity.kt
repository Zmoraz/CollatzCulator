package com.example.howmuchtimeisleft

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CalendarView
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var vsego = findViewById<TextView>(R.id.textView3)
        var listing = findViewById<TextView>(R.id.textView)
        var button = findViewById<Button>(R.id.button)
        var textin = findViewById<TextInputEditText>(R.id.textInputEditText)


        button.setOnClickListener {

            listing.setText("")
            var temptext = textin.text
            var x: Int = temptext.toString().toInt()
            var count = 0

            while(x > 1) {


                if(x % 2 == 0) {
                    x /= 2
                } else {
                    x = (x * 3) + 1
                }

                count += 1
                listing.append("${count}) $x\n")

            }

        vsego.setText("Всего итераций $count")




        }

    }
}