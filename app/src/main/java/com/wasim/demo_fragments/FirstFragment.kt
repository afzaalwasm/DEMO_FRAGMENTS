package com.wasim.demo_fragments

import android.app.Application
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_first.view.*
class FirstFragment : Fragment() {
    private lateinit var cummunicator: Cummunicator

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_first, flfragment, false)
        cummunicator = activity as Cummunicator
       view.sendBtn.setOnClickListener{
           cummunicator.passDataCom(view.messageInput.text.toString())
       }
        Toast.makeText(context, "first fragment", Toast.LENGTH_LONG).show()
        return view
    }
}