package com.example.dmitrii_korolev_shop.ui

import android.content.Intent
import android.os.Bundle
import com.example.dmitrii_korolev_shop.R
import kotlinx.android.synthetic.main.basket_layout.*
import kotlinx.android.synthetic.main.catalog_layout.*

class BasketActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.basket_layout)
        addListeners()
    }

    private fun addListeners()
    {
        basketToCatalogBtn.setOnClickListener{
            startActivity(Intent(this, CatalogActivity::class.java))
        }
        basketToCheckoutBtn.setOnClickListener{
            startActivity(Intent(this, CheckoutActivity::class.java))
        }
        basketBackArrow.setOnClickListener{
            finish()
        }
    }
}