package com.example.capst

import android.graphics.Bitmap
import android.graphics.Color
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.zxing.BarcodeFormat
import com.google.zxing.qrcode.QRCodeWriter

class QrcodeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_qr_code)

        val studentId = intent.getStringExtra("student_id")
        val studentName = intent.getStringExtra("student_name")

        val textViewId = findViewById<TextView>(R.id.textViewId)
        val textViewName = findViewById<TextView>(R.id.textViewName)
        val imageViewQrCode = findViewById<ImageView>(R.id.imageViewQrCode)

        textViewId.text = "학번: $studentId"
        textViewName.text = "이름: $studentName"

        studentId?.let {
            val qrBitmap = generateQRCode(it)
            imageViewQrCode.setImageBitmap(qrBitmap)
        }
    }

    private fun generateQRCode(text: String): Bitmap {
        val writer = QRCodeWriter()
        val bitMatrix = writer.encode(text, BarcodeFormat.QR_CODE, 512, 512)
        val bmp = Bitmap.createBitmap(512, 512, Bitmap.Config.RGB_565)

        for (x in 0 until 512) {
            for (y in 0 until 512) {
                bmp.setPixel(x, y, if (bitMatrix[x, y]) Color.BLACK else Color.WHITE)
            }
        }

        return bmp
    }
}