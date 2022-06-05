package com.example.calcapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        var edittext1 = intent.getFloatExtra("VALUE1",0F)
        var edittext2 = intent.getFloatExtra("VALUE2",0F)
        textview.text = "${edittext1 + edittext2}"

        var edittext3 = intent.getFloatExtra("VALUE3",0F)
        var edittext4 = intent.getFloatExtra("VALUE4",0F)
        textview.text = "${edittext3 - edittext4}"
    }
}