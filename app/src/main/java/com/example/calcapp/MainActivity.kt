package com.example.calcapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        pulsbutton.setOnClickListener{
            try {
                var intent = Intent(this,SecondActivity::class.java)
                var num1 = editText1.text.toString().toFloat()
                var num2 = editText2.text.toString().toFloat()
                var result = num1 + num2
                intent.putExtra("VALUE1",result)
                startActivity(intent)
            }catch (e: Exception){
                Log.d("error","空白かNULLがあります")
            }
        }

        minusbutton.setOnClickListener{
            try {
                var intent = Intent(this,SecondActivity::class.java)
                var num1 = editText1.text.toString().toFloat()
                var num2 = editText2.text.toString().toFloat()
                val result = num1 - num2
                intent.putExtra("VALUE1",result)
                startActivity(intent)
            }catch (e:Exception){
                Log.d("error","空白かNULLがあります")
            }
        }

        timesbutton.setOnClickListener{
            try {
                var intent = Intent(this,SecondActivity::class.java)
                var num1 = editText1.text.toString().toFloat()
                var num2 = editText2.text.toString().toFloat()
                val result = num1 * num2
                intent.putExtra("VALUE1",result)
                startActivity(intent)
            }catch (e:Exception){
                Log.d("error","空白かNULLがあります")
            }

        }

        dividedbutton.setOnClickListener{
            try {
                var intent = Intent(this,SecondActivity::class.java)
                var num1 = editText1.text.toString().toFloat()
                var num2 = editText2.text.toString().toFloat()
                val result = num1 / num2
                intent.putExtra("VALUE1",result)
                startActivity(intent)
            }catch(e:Exception){
                Log.d("error","空白かNULLがあります")
            }
        }
    }
}