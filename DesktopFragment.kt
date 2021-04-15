package com.shiqiliu.onlineshoppingpractice.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.shiqiliu.onlineshoppingpractice.Adapter.AdapterProduct
import com.shiqiliu.onlineshoppingpractice.Modules.Product
import com.shiqiliu.onlineshoppingpractice.R
import kotlinx.android.synthetic.main.fragment_desktop.*
import kotlinx.android.synthetic.main.fragment_desktop.view.*
import kotlinx.android.synthetic.main.fragment_mobile.*
import kotlinx.android.synthetic.main.fragment_mobile.list_view_m

class DesktopFragment : Fragment() {
    var mList:ArrayList<Product> = ArrayList()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var view = inflater.inflate(R.layout.fragment_desktop, container, false)
        generateData()
        var adapterProduct = AdapterProduct(activity!!,mList)
        view.list_view_d.adapter=adapterProduct
        return view
    }



    private fun generateData() {
        mList.add(Product("HP-4GB Memory",399,R.drawable.desktop_hp))
    }


}