package com.wasim.demo_fragments

import android.app.Application
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.NavController
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_first.*
import kotlinx.android.synthetic.main.fragment_first.view.*

class FirstFragment : Fragment(R.layout.fragment_first) {

    lateinit var navController: NavController

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController = Navigation.findNavController(view)
        view.sendBtn.setOnClickListener {
            val dataString = messageInput.text.toString()
            val bundle = Bundle()
            bundle.putString("data", dataString)
            navController.navigate(R.id.action_firstFragment_to_secondFragment,bundle)
        }
        Toast.makeText(context, "first fragment", Toast.LENGTH_LONG).show()
    }
}