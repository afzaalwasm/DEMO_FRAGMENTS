 package com.wasim.demo_fragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils.replace
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), Cummunicator {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val firstFragment = FirstFragment()
        supportFragmentManager.beginTransaction().replace(R.id.flfragment,firstFragment).commit()
//        val secondFragment = SecondFragment()
//        supportFragmentManager.beginTransaction().apply {
//            replace(R.id.flfragment, firstFragment)
//            commit()
//        }
//        btnFragment1.setOnClickListener {
//            supportFragmentManager.beginTransaction().apply {
//                replace(R.id.flfragment, firstFragment)
//                commit()
//            }
//        }
//        btnFragment2.setOnClickListener {
//            supportFragmentManager.beginTransaction().apply {
//                replace(R.id.flfragment, secondFragment )
//                commit()
//            }
//        }
    }

    override fun passDataCom(editTextInput: String) {
        val bundle = Bundle()
        bundle.putString("mmessage", editTextInput)

        val transaction = this.supportFragmentManager.beginTransaction()
        val firstFragment= FirstFragment()
        firstFragment.arguments=bundle

        transaction.replace(R.id.flfragment, firstFragment)
        transaction.commit()

    }
}