package com.example.davaleba5

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class ProductsFragment: Fragment(R.layout.item_product) {
    private lateinit var button: Button
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        button=view.findViewById(R.id.viewButton)
        button.setOnClickListener {
            val action=ProductsFragmentDirections.actionProductsFragmentToSelectedProductsFragment()
            findNavController().navigate(action)
        }
    }
}