package com.bhardwaj.intern.views.onboarding

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.bhardwaj.intern.R

class SplashFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Handler(Looper.myLooper()!!).postDelayed({
            findNavController().navigate(R.id.action_splashFragment_to_welcomeFragment)
        }, 100)
        return inflater.inflate(R.layout.fragment_splash, container, false)
    }

    //TODO: Aditya - Change delay back to 3000ms.
}