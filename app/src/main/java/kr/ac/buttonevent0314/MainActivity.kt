package kr.ac.buttonevent0314

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var btn : Button
    lateinit var btnHome : Button
    lateinit var btn911 : Button
    lateinit var btnGallery : Button
    lateinit var btnFinish : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn = findViewById(R.id.button)
        btnHome = findViewById(R.id.buttonHome)
        btnHome = findViewById(R.id.button911)
        btnHome = findViewById(R.id.buttonGallery)
        btnHome = findViewById(R.id.buttonFinsh)

        btnHome.setOnClickListener {
            var intent = Intent(Intent.ACTION_VIEW, Uri.parse(("https://www.kopo.ac.kr/jungsu/index.do")))
            startActivity(intent)
        }

        btn911.setOnClickListener {
            var intent = Intent(Intent.ACTION_VIEW, Uri.parse(("tel:/911")))
            startActivity(intent)
        }
        btnGallery.setOnClickListener {
            var intent = Intent(Intent.ACTION_VIEW, Uri.parse(("content://media/internal/images/media")))
            startActivity(intent)
        }
        btnFinish.setOnClickListener {
           finish()
        }
        btn.setOnClickListener {
            Toast.makeText(applicationContext, "기분 좋은 오후입니다.",  Toast.LENGTH_SHORT).show()
        }
    }
}