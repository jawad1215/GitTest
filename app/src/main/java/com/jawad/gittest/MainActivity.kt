package com.jawad.gittest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var button:Button
    var textView:TextView?=null
    var increment=0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button=findViewById(R.id.button)
        textView=findViewById(R.id.textView)
        val reset=findViewById<Button>(R.id.reset)
        button.setOnClickListener { inCrement() }
        reset.setOnClickListener { resetCounter() }
    }



    private fun inCrement() {
        increment += 1
        textView?.text=increment.toString()

    }

    private fun resetCounter() {
        increment=0
        textView?.text=increment.toString()
    }



}