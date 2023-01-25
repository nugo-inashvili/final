package com.example.davaleba5

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class SelectedProductsFragment: Fragment(R.layout.selected_products) {
    private lateinit var returnButton: Button
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        returnButton=view.findViewById(R.id.returnButton)
        returnButton.setOnClickListener {
            val action=SelectedProductsFragmentDirections.actionSelectedProductsFragmentToProductsFragment()
            findNavController().navigate(action)
        }
    }
}