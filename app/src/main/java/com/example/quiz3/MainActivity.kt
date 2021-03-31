package com.example.quiz3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val toast1 = Toast.makeText(applicationContext, "ไม่ถูกต้อง", Toast.LENGTH_LONG)
        val toast2 = Toast.makeText(applicationContext, "ถูกต้อง", Toast.LENGTH_LONG)

        submit.setOnClickListener {
            if (this.bt1.text.toString() != this.bt3.text.toString()) {
                toast1.show()
            } else if (this.bt2.text.toString() != this.bt3.text.toString()) {
                toast1.show()
            } else if (this.bt3.text.toString() == this.bt3.text.toString()) {
                toast2.show()
            } else {
                toast1.show()
            }
        }
        submit2.setOnClickListener{
            if (this.bt5.text.toString() == this.bt7.text.toString()) {
                toast2.show()
            } else if (this.bt6.text.toString() != this.bt7.text.toString()) {
                toast1.show()
            } else if (this.bt8.text.toString() == this.bt7.text.toString()) {
                toast2.show()
            }
        }
        next1.setOnClickListener{
                startActivity(Intent(this,p1::class.java))
        }
    }
}