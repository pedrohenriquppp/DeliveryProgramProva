package com.abc.deliveryapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        transition()
    }
    fun transition (){
        Handler().postDelayed({ intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
            finish()
        }, 4000)
    }
}
