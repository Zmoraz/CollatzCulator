package com.example.howmuchtimeisleft

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.jjoe64.graphview.GraphView
import com.jjoe64.graphview.series.DataPoint
import com.jjoe64.graphview.series.LineGraphSeries
import com.jjoe64.graphview.series.PointsGraphSeries


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var total = findViewById<TextView>(R.id.message)
        var list = findViewById<TextView>(R.id.list)
        var textin = findViewById<TextView>(R.id.textinput)
        var graph = findViewById<GraphView>(R.id.graph)



        val series: LineGraphSeries<DataPoint> = LineGraphSeries(
            arrayOf(
                DataPoint(0.0, 959595.0),
                DataPoint(1.0, 594499222.0),
                DataPoint(2.0, 56566499.0),
                DataPoint(3.0, 4.0),
                DataPoint(4.0, 2.0),
                DataPoint(5.0, 1.0)
            )
        )
        graph.addSeries(series)



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
        val btn_clear = findViewById<TextView>(R.id.clear_button)
        val btn_go = findViewById<TextView>(R.id.go_button)

        btn_1.setOnClickListener {
            textin.append("1")

        }
        btn_2.setOnClickListener {
            textin.append("2")
        }
        btn_3.setOnClickListener {
            textin.append("3")
        }
        btn_4.setOnClickListener {
            textin.append("4")
        }
        btn_5.setOnClickListener {
            textin.append("5")
        }
        btn_6.setOnClickListener {
            textin.append("6")
        }
        btn_7.setOnClickListener {
            textin.append("7")
        }
        btn_8.setOnClickListener {
            textin.append("8")
        }
        btn_9.setOnClickListener {
            textin.append("9")
        }
        btn_0.setOnClickListener {
            textin.append("0")
        }

        btn_clear.setOnClickListener {
            total.setText("Введите число")
            list.setText("")
            textin.setText("")
        }
        btn_go.setOnClickListener {

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