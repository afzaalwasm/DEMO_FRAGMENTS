package com.wasim.demo_fragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import android.widget.Toast
import androidx.navigation.NavController
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_first.*
import kotlinx.android.synthetic.main.fragment_first.view.*

class FirstFragment : Fragment(R.layout.fragment_first) {

    lateinit var navController: NavController
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController = Navigation.findNavController(view)
        view.sendBtn.setOnClickListener {
            val dataString = messageInput.text.toString()
            val dataString2 = messageInput2.text.toString()
            val bundle = Bundle()
            bundle.putString("data", dataString)
            bundle.putString("data2", dataString2)

//            val intent = Intent(requireActivity(), MainActivity2::class.java)
//            intent.putExtra("data", bundle)
////            intent.putExtra("sData",dataString)
//            startActivity(intent)
            navController.navigate(R.id.action_firstFragment_to_secondFragment,bundle)
        }
        Toast.makeText(requireActivity(), "first fragment", Toast.LENGTH_LONG).show()
    }
}