package com.vaibhavrawat.constraintlayout

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    var btnRelativeLayout : Button?= null
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnRelativeLayout = findViewById(R.id.btnRelativeLayout)
        btnRelativeLayout?.setOnClickListener {
            var intent = Intent(this, ConstraintLayoutView::class.java)
            startActivity(intent)
        }
    }
}