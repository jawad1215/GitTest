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
        button.setOnClickListener { inCrement() }
    }

    private fun inCrement() {
        increment += 4
        textView?.setText(increment.toString())

    }


}