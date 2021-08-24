package com.bhardwaj.intern.views.onboarding

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.findNavController
import com.bhardwaj.intern.R

class WelcomeFragment : Fragment() {
    private lateinit var navController: NavController
    private lateinit var tvSignUp: TextView
    private lateinit var tvSignIn: TextView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_welcome, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        tvSignUp = view.findViewById(R.id.tvSignUp)
        tvSignIn = view.findViewById(R.id.tvSignIn)
        navController = view.findNavController()

        tvSignIn.setOnClickListener {
            navController.navigate(WelcomeFragmentDirections.actionWelcomeFragmentToLoginFragment())
        }
        tvSignUp.setOnClickListener {
            navController.navigate(WelcomeFragmentDirections.actionWelcomeFragmentToSignUpFragment())
        }
    }
}