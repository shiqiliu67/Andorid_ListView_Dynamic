package com.shiqiliu.onlineshoppingpractice.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.shiqiliu.onlineshoppingpractice.Adapter.AdapterProduct
import com.shiqiliu.onlineshoppingpractice.Modules.Product
import com.shiqiliu.onlineshoppingpractice.R
import kotlinx.android.synthetic.main.fragment_laptop.*
import kotlinx.android.synthetic.main.fragment_laptop.view.*
import kotlinx.android.synthetic.main.fragment_mobile.*

class LaptopFragment : Fragment() {
    var mList:ArrayList<Product> = ArrayList()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var view =inflater.inflate(R.layout.fragment_laptop, container, false)
      //  init()
        generateData()
        var adapterProduct = AdapterProduct(activity!!,mList)
        view.list_view_l.adapter=adapterProduct
        return view
    }
//    private fun init() {
//        generateData()
//        var adapterProduct = AdapterProduct(activity!!,mList)
//        list_view_l.adapter=adapterProduct
//
//    }

    private fun generateData() {
        mList.add(Product("MacBook Pro 13.3\" Laptop",1199,R.drawable.laptop_macpro))
    }

}