package com.wasim.demo_fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_second.view.*

class SecondFragment : Fragment(R.layout.fragment_second) {
    var displayMessage: String? = ""
    var displayMessage2: String? = ""
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        displayMessage = arguments?.getString("data")
        displayMessage2 = arguments?.getString("data2")
        if (displayMessage == null){
            Toast.makeText(context, "No value received!", Toast.LENGTH_LONG).show()
        }else{
            view.displayMessage.text = displayMessage
            view.displayMessage2.text = displayMessage2
            Toast.makeText(context, "$displayMessage", Toast.LENGTH_LONG).show()
        }
    }
}


