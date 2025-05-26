package com.example.capst

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnSchedule = findViewById<Button>(R.id.btnSchedule)
        val btnQrCode = findViewById<Button>(R.id.btnQrCode)
        val btnStudentInfo = findViewById<Button>(R.id.btnStudentInfo)

        btnSchedule.setOnClickListener {
            startActivity(Intent(this,ScheduleActivity::class.java))

        }
        btnQrCode.setOnClickListener {
            startActivity(Intent(this,QrCodeActivity::class.java))

        }
        btnStudentInfo.setOnClickListener {
            startActivity(Intent(this,StudentInfoActivity::class.java))

        }
    }
}