package com.artifexmundi.balefi.white

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.artifexmundi.balefi.R

class Rule : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rule)
        val rulek=findViewById<ImageView>(R.id.startBtn2)
        rulek.setOnClickListener {

            startActivity(
                Intent(this@Rule,
                    Game::class.java)
            )

        }

    }
}