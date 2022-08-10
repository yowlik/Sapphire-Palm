package com.artifexmundi.balefi.white

import android.content.Intent
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import com.artifexmundi.balefi.R

class Game : AppCompatActivity() {


    val roll=mutableListOf<String>("Cow","Owl","Rabbit")
    lateinit var im1:ImageView
    lateinit var im2:ImageView
    lateinit var im3:ImageView
    lateinit var im4:ImageView
    lateinit var im5:ImageView
    lateinit var im6:ImageView
    var point1=0
    var point2=0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game)
        im1=findViewById(R.id.im1)
        im2=findViewById(R.id.im2)
        im3=findViewById(R.id.im3)
        im4=findViewById(R.id.im4)
        im5=findViewById(R.id.im5)
        im6=findViewById(R.id.im6)
        var textp1=findViewById<TextView>(R.id.score1)
        var textp2=findViewById<TextView>(R.id.score2)
        var startB=findViewById<ImageView>(R.id.startBtn)
        val ruleb=findViewById<ImageView>(R.id.rulebtn)
        ruleb.setOnClickListener {

                startActivity(
                    Intent(this@Game,
                        Rule::class.java)
                )

            }


        startB.setOnClickListener {
            val im11=roll.random()
            val im22=roll.random()
            val im33=roll.random()
            val im44=roll.random()
            val im55=roll.random()
            val im66=roll.random()
            check(im11,im1)
            check(im22,im2)
            check(im33,im3)
            check(im44,im4)
            check(im55,im5)
            check(im66,im6)
            if(im11==im22&&im22==im33){
                point2=point2+20
                textp2.text=point2.toString()
            }else if(im11==im22){
                point2=point2+5
                textp2.text=point2.toString()
            }
            if(im44==im55&&im55==im66){
                point1=point1+20
                textp1.text=point1.toString()
            }else if(im44==im55){
                point1=point1+5
                textp1.text=point1.toString()
            }

        }
    }


    fun check(i:String,im:ImageView){
        if(i=="Cow"){
            im.setImageResource(R.drawable.first)
        }else if(i=="Owl"){
            im.setImageResource(R.drawable.second)

        }else{
            im.setImageResource(R.drawable.third)
        }

    }

}