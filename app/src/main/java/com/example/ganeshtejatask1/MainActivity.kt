package com.example.ganeshtejatask1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val r=findViewById<TextView>(R.id.red)
        val g=findViewById<TextView>(R.id.green)
        val y=findViewById<TextView>(R.id.yellow)
        val c=findViewById<TextView>(R.id.col)
        r.setOnClickListener {
            c.text="Red button is clicked"
        }

        g.setOnClickListener {
            c.text="Green button is clicked"
        }
        y.setOnClickListener {
            c.text="Yellow button is clicked"
        }
    }
}