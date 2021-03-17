package com.wasim.demo_fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_splash.*


class SplashFragment : Fragment(R.layout.fragment_splash), View.OnClickListener {

    lateinit var navController: NavController

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController = Navigation.findNavController(view)

        btn_next.setOnClickListener(this)
    }

    override fun onClick(p0: View?) {
       if (p0?.id == R.id.btn_next){
           navController.navigate(R.id.action_splashFragment_to_firstFragment)
       }
    }

}