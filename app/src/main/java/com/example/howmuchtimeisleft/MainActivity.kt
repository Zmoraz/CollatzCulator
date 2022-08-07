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

        var total = findViewById<TextView>(R.id.message)
        var list = findViewById<TextView>(R.id.list)
        var go = findViewById<TextView>(R.id.go_button)
        var textin = findViewById<TextView>(R.id.textinput)

        val btn_1 = findViewById<TextView>(R.id.button1)
        val btn_2 = findViewById<TextView>(R.id.button2)
        val btn_3 = findViewById<TextView>(R.id.button3)
        val btn_4 = findViewById<TextView>(R.id.button4)
        val btn_5 = findViewById<TextView>(R.id.button5)
        val btn_6 = findViewById<TextView>(R.id.button6)
        val btn_7 = findViewById<TextView>(R.id.button7)
        val btn_8 = findViewById<TextView>(R.id.button8)
        val btn_9 = findViewById<TextView>(R.id.button9)
        val btn_0 = findViewById<TextView>(R.id.button0)

        btn_1.setOnClickListener {
            textin.append("1")
        }


        go.setOnClickListener {

            list.setText("")
            var temptext = textin.text
            var x: Double = temptext.toString().toDouble()
            var count = 0



            while(x > 1) {


                if(x % 2.0 == 0.0) {
                    x /= 2
                } else {
                    x = (x * 3) + 1
                }

                count += 1

                list.append("${count}) ${x}\n")

            }

        total.setText("Всего итераций $count")




        }

    }
}