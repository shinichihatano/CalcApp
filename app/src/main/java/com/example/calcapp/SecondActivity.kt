package com.example.calcapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        var edittext4 = intent.getFloatExtra("VALUE1",0F)
        var edittext5 = intent.getFloatExtra("VALUE2",0F)
        textview.text = "${edittext4 + edittext5}"
    }
}