package com.shiqiliu.onlineshoppingpractice.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import com.shiqiliu.onlineshoppingpractice.Adapter.AdapterProduct
import com.shiqiliu.onlineshoppingpractice.Modules.Product
import com.shiqiliu.onlineshoppingpractice.R
import kotlinx.android.synthetic.main.fragment_mobile.*
import kotlinx.android.synthetic.main.fragment_mobile.view.*
import kotlinx.android.synthetic.main.row_adapter_product.*

class MobileFragment : Fragment() {
    var mList:ArrayList<Product> = ArrayList()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var view = inflater.inflate(R.layout.fragment_mobile, container, false)
        generateData()
        var adapterProduct = AdapterProduct(activity!!,mList)
        view.list_view_m.adapter=adapterProduct
        return view
    }


    private fun generateData() {
        mList.add(Product("iphone 11 - 64 GB",599,R.drawable.iphone_11))
        mList.add(Product("iphone 11 Pro - 64 GB",899,R.drawable.iphone_11_pro))
        mList.add(Product("iphone SE - 64 GB",399,R.drawable.iphone_se))
        mList.add(Product("iphone 12 - 64 GB",799,R.drawable.iphone12))
        mList.add(Product("iphone 12 Pro - 64 GB",999,R.drawable.iphone12_pro))
    }

}