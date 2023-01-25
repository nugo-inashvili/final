package com.example.davaleba5

import android.database.sqlite.SQLiteDatabase
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class ProductsAdapter (
    private val layoutInflater: LayoutInflater
    ) : RecyclerView.Adapter<ProductViewHolder>() {
        private val productData = mutableListOf<Product>()
        fun setData(productData: List<Product>) {
            this.productData.clear()
            this.productData.addAll(productData)
            notifyDataSetChanged()
        }
        override fun onCreateViewHolder(parent: ViewGroup,
                                        viewType: Int): ProductViewHolder {
            val view = layoutInflater.inflate(
                R.layout.item_product,
                parent, false)
            return ProductViewHolder(view)
        }
        override fun getItemCount() = productData.size
        override fun onBindViewHolder(holder: ProductViewHolder,
                                      position: Int) {
            holder.bindData(productData[position])
        }
}