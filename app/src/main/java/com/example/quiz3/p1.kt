package com.example.quiz3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_p1.*

class p1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_p1)
        val toast1 = Toast.makeText(applicationContext, "ไม่ถูกต้อง", Toast.LENGTH_LONG)
        val toast2 = Toast.makeText(applicationContext, "ถูกต้อง", Toast.LENGTH_LONG)

        submit3.setOnClickListener {
            if (this.b9.text.toString() != this.b12.text.toString()) {
                toast1.show()
            } else if (this.b10.text.toString() != this.b12.text.toString()) {
                toast1.show()
            } else if (this.b11.text.toString() != this.b12.text.toString()) {
                toast1.show()
            } else {
                toast1.show()
            }
        }
        submit4.setOnClickListener{
            if (this.b13.text.toString() != this.b15.text.toString()) {
                toast1.show()
            }else if(this.b14.text.toString() != this.b15.text.toString()){
                toast1.show()
            }else if(this.b15.text.toString() == this.b15.text.toString()){
                toast2.show()
            }else{
                toast1.show()
            }
        }
        next2.setOnClickListener{
            startActivity(Intent(this,p2::class.java))
        }
    }
}