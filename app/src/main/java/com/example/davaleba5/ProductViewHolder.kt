package com.example.davaleba5
import android.util.Log
import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.davaleba5.R
class ProductViewHolder(
    containerView: View,
) : RecyclerView.ViewHolder(containerView) {
    private val productIdView: TextView
            by lazy { containerView.findViewById(R.id.product_id) }
    private val productNameView: TextView
            by lazy { containerView.findViewById(R.id.product_name) }
    private val productPriceView: TextView
            by lazy { containerView.findViewById(R.id.product_price) }
    fun bindData(productData: Product) {
        productIdView.text= productData.ID.toString()
        productNameView.text = productData.PRODUCT_NAME
        productPriceView.text = productData.PRICE.toString()+" "+"₾"
        }
    }