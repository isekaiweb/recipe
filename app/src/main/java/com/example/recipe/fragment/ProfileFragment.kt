package com.example.recipe.fragment

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.recipe.databinding.FragmentProfileBinding
import com.example.recipe.function.glide


class ProfileFragment : Fragment() {
    private lateinit var binding: FragmentProfileBinding
    private lateinit var navController: NavController

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentProfileBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initNavController(view)
        initEventClick()
        initImgProfile()
    }

    private fun initEventClick() {
        binding.apply {
            incToolbar.imgBackToolbar.setOnClickListener {
                navController.popBackStack()
            }

            tvEmailProfile.setOnClickListener {
                val intent = Intent(Intent.ACTION_SENDTO)
                intent.data = Uri.parse("mailto: ${binding.tvEmailProfile.text}")
                startActivity(intent)
            }
        }


    }

    private fun initNavController(view: View) {
        navController = Navigation.findNavController(view)
    }


    private fun initImgProfile() {
        val src =
            "https://d17ivq9b7rppb3.cloudfront.net/small/avatar/202102240822175c7d208dcb2c122542720d48eff67631.png"

        glide(
            requireContext(),
            src,
            binding.imgProfile
        )
    }


}