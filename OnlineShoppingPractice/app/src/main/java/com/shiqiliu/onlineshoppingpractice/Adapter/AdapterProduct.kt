package com.shiqiliu.onlineshoppingpractice.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import com.shiqiliu.onlineshoppingpractice.Modules.Product
import com.shiqiliu.onlineshoppingpractice.R
import kotlinx.android.synthetic.main.row_adapter_product.view.*

class AdapterProduct(var mContext: Context, var mList:ArrayList<Product>) : BaseAdapter(){
    override fun getCount(): Int {
       return mList.size
    }

    override fun getItem(position: Int): Any {
        return mList[position]
    }

    override fun getItemId(position: Int): Long {
        return  position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
       var layoutInflater =LayoutInflater.from(mContext)
        var view = layoutInflater.inflate(R.layout.row_adapter_product,parent,false)
        var product=mList[position]
        view.text_view_name.text = product.name
        view.text_view_price.text= product.price.toString()
        view.image_view.setImageResource(product.image)
        return view
    }

}