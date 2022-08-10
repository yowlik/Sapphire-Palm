package com.artifexmundi.balefi.white

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.artifexmundi.balefi.R

class Start : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start)
        val start=findViewById<ImageView>(R.id.startBtn1)
        start.setOnClickListener{
            startActivity(
                Intent(this@Start,
                    Game::class.java)
            )

        }

    }
}