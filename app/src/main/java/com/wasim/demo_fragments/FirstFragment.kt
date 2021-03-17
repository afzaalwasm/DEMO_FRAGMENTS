package com.wasim.demo_fragments

import android.app.Application
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast


class FirstFragment : Fragment(R.layout.fragment_first) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Toast.makeText(context,"first fragment", Toast.LENGTH_LONG).show()

    }




}