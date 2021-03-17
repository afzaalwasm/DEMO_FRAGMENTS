 package com.wasim.demo_fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_second.view.*

 class SecondFragment: Fragment(){
     var displayMessage: String?= ""
     override fun onCreateView(
         inflater: LayoutInflater,
         container: ViewGroup?,
         savedInstanceState: Bundle?
     ): View? {
         val view= inflater.inflate(R.layout.fragment_second,flfragment,false)
         displayMessage= arguments?.getString("message")
         view.displayMessage.text=displayMessage
         Toast.makeText(context,"second fragment", Toast.LENGTH_LONG).show()
         return view
     }
 }


// class SecondFragment : Fragment(R.layout.fragment_second) {
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//
//        Toast.makeText(context,"second fragment", Toast.LENGTH_LONG).show()
//
//    }
//
//}