package com.shiqiliu.onlineshoppingpractice.Activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.shiqiliu.onlineshoppingpractice.Adapter.AdapterFragment
import com.shiqiliu.onlineshoppingpractice.Modules.Category
import com.shiqiliu.onlineshoppingpractice.Modules.Product
import com.shiqiliu.onlineshoppingpractice.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var productList:ArrayList<Product> = ArrayList()
    var categoryList:ArrayList<Category> = ArrayList()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()
    }

    private fun init() {
        //set in tab & view pager
//        var adapterFragment = AdapterFragment(supportFragmentManager)
//        view_pager.adapter=adapterFragment
//        tab_layout.setupWithViewPager(view_pager)
        //set in list view in fragment activity
        getCategories()
        var adapterFragment = AdapterFragment(supportFragmentManager)
        for (category in categoryList){
            adapterFragment.addFragment(category)
        }
        view_pager.adapter=adapterFragment
        tab_layout.setupWithViewPager(view_pager)
    }

    private fun getCategories() {
        categoryList.add(Category(1, "Mobile"))
        categoryList.add(Category(2, "Laptop"))
        categoryList.add(Category(3, "Desktop"))
    }
}