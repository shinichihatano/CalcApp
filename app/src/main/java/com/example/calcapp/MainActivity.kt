package com.example.calcapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        pulsbutton.setOnClickListener{
            try {
                var intent = Intent(this,SecondActivity::class.java)
                intent.putExtra("VALUE1",editText1.text.toString().toFloat())
                intent.putExtra("VALUE2",editText2.text.toString().toFloat())
                startActivity(intent)
                //var edittext1 = editText1.text.toString().toFloat()
               // var edittext2 = editText2.text.toString().toFloat()
               // var kaitou = edittext1 + edittext2
               // textview1.text = kaitou.toString()
            }catch (e: Exception){
                var intent = Intent(this,SecondActivity::class.java)
                intent.putExtra("VALUE1","空白があります")
                intent.putExtra("VALUE2","空白があります")
                startActivity(intent)
                textview1.text = "空白があります。"
            }
        }

        minusbutton.setOnClickListener{
            try {
                var edittext1 = editText1.text.toString().toFloat()
                var edittext2 = editText2.text.toString().toFloat()
                var kaitou = edittext1 - edittext2
                textview1.text = kaitou.toString()
            }catch (e:Exception){
                textview1.text = "空白があります。"
            }
        }

        timesbutton.setOnClickListener{
            try {
                var edittext1 = editText1.text.toString().toFloat()
                var edittext2 = editText2.text.toString().toFloat()
                var kaitou = edittext1 * edittext2
                textview1.text = kaitou.toString()
            }catch (e:Exception){
                textview1.text = "空白があります。"
            }

        }

        dividedbutton.setOnClickListener{
            try {
                var edittext1 = editText1.text.toString().toFloat()
                var edittext2 = editText2.text.toString().toFloat()
                var kaitou = edittext1 / edittext2
                textview1.text = kaitou.toString()
            }catch(e:Exception){
                textview1.text = "空白があります。"
            }
        }
    }
}