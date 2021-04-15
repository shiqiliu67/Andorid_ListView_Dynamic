package com.shiqiliu.onlineshoppingpractice.Modules

import java.io.Serializable

data class Product(
    var name:String,
    var price:Int,
    var image:Int
):Serializable{
    companion object{
        const val KEY_Product = "Product"
    }
}