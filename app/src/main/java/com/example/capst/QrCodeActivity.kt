package com.example.capst

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class QrCodeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_qr_code)

        val userName = intent.getStringExtra("userName") ?: "홍길동"
        val studentId = intent.getStringExtra("studentId") ?: "202312345"

        val textUserName = findViewById<TextView>(R.id.textUserName)
        val textStudentId = findViewById<TextView>(R.id.textStudentId)
        val imageQrCode = findViewById<ImageView>(R.id.imageQrCode)

        textUserName.text = "이름: $userName"
        textStudentId.text = "학번: $studentId"

    }
}