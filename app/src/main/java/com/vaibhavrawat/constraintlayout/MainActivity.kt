package com.vaibhavrawat.constraintlayout

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    var btnRelativeLayout : Button?= null
    var btnRelativeLayoutSwitch : Button?=null
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnRelativeLayout = findViewById(R.id.btnRelativeLayout)
        btnRelativeLayoutSwitch = findViewById(R.id.btnRelativeLayoutSwitch)
        btnRelativeLayout?.setOnClickListener {
            val intent = Intent(this, ConstraintLayoutView::class.java)
            startActivity(intent)
        }
        btnRelativeLayoutSwitch?.setOnClickListener {
            val intent = Intent(this, RelativeLayout::class.java)
            startActivity(intent)
        }
    }
}