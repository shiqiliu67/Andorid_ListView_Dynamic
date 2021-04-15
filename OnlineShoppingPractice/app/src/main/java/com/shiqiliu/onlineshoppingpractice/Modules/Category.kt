package com.shiqiliu.onlineshoppingpractice.Modules

import java.io.Serializable

data class Category(
    var catId:Int,
    var catName:String
)
    :Serializable{
    companion object{
        const val KEY_Cat_ID="catID"
    }
}