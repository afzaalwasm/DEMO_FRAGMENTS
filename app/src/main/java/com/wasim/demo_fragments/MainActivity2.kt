package com.wasim.demo_fragments

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.google.android.play.core.internal.s
import kotlinx.android.synthetic.main.activity_main2.*
import kotlinx.android.synthetic.main.fragment_second.view.*

class MainActivity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val bundle = intent.getBundleExtra("data")!!
        //val sData = intent.getStringExtra("sData")!!
        val k1:String = bundle.getString("data","")
        val k2:String = bundle.getString("data2","")
        tvw.text= "$k1 \n $k2"

        Toast.makeText(this, "Data: $k1${k2.trim()}", Toast.LENGTH_SHORT).show()
    }
}



