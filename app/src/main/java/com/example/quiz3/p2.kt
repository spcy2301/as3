package com.example.quiz3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_p1.*
import kotlinx.android.synthetic.main.activity_p2.*

class p2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_p2)
        val toast1 = Toast.makeText(applicationContext, "ไม่ถูกต้อง", Toast.LENGTH_LONG)
        val toast2 = Toast.makeText(applicationContext, "ถูกต้อง", Toast.LENGTH_LONG)

        ok.setOnClickListener{
            if (this.b111.text.toString() != this.b113.text.toString()) {
                toast1.show()
            } else if (this.b112.text.toString() != this.b113.text.toString()) {
                toast1.show()
            } else if (this.b114.text.toString() == this.b114.text.toString()) {
                toast2.show()
            } else {
                toast1.show()
            }
        }
    }
}