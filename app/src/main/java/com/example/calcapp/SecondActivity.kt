package com.example.calcapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        var edittext4 = intent.getIntExtra("VALUE1",0)
        var edittext5 = intent.getIntExtra("VALUE2",0)
        var edittext6 = edittext4 + edittext5

        textview.text = "$edittext6"
    }
}