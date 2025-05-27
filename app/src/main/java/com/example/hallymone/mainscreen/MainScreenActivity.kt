package com.example.hallymone.mainscreen

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.hallymone.R
import com.example.hallymone.CreditActivity
import com.example.hallymone.ui.schedule.AddScheduleActivity
import com.example.qrcode

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_screen)

        // 버튼 연결
        val btnAcademic = findViewById<Button>(R.id.btnAcademic)
        val btnSchedule = findViewById<Button>(R.id.btnSchedule)
        val btnQR = findViewById<Button>(R.id.btnQR)

        // 학적 버튼 클릭 시 이동
        btnAcademic.setOnClickListener {
            val intent = Intent(this, AcademicActivity::class.java)
            startActivity(intent)
        }

        // 일정 버튼 클릭 시 이동
        btnSchedule.setOnClickListener {
            val intent = Intent(this, AddScheduleActivity::class.java)
            startActivity(intent)
        }

        // 전자출결 버튼 클릭 시 이동
        btnQR.setOnClickListener {
            val intent = Intent(this, QrActivity::class.java)
            startActivity(intent)
        }
    }
}