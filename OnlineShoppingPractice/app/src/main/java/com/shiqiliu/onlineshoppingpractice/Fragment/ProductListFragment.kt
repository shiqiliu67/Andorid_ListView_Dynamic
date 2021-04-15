package com.shiqiliu.onlineshoppingpractice.Fragment

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.shiqiliu.onlineshoppingpractice.Adapter.AdapterProduct
import com.shiqiliu.onlineshoppingpractice.Modules.Category
import com.shiqiliu.onlineshoppingpractice.Modules.Product
import com.shiqiliu.onlineshoppingpractice.R
import kotlinx.android.synthetic.main.fragment_product_list.view.*
import java.util.*
import kotlin.collections.ArrayList

class ProductListFragment :Fragment(){
var productList : ArrayList<Product> = ArrayList()
var mContext : Context? = null
    private  var catId :Int? =null

    override fun onAttach(context: Context) {
        super.onAttach(context)
        mContext=context
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            catId = it.getInt(Category.KEY_Cat_ID)

        }
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var view = inflater.inflate(R.layout.fragment_product_list, container, false)
        init(view)
        return view
    }

    private fun init(view: View) {
        generateData()
        // view.text_view_id.text = catId.toString()
        var productAdapter = AdapterProduct(mContext!!, productList)
        view.list_view.adapter = productAdapter
        view.list_view.setOnItemClickListener(object: AdapterView.OnItemClickListener{
            override fun onItemClick(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                Toast.makeText(mContext!!, productList[position].name, Toast.LENGTH_SHORT).show()
            }

        })

    }

    private fun generateData() {
        productList.clear()
        when(catId){
            1 ->{
                productList.add(Product("iphone 11 - 64 GB",599,R.drawable.iphone_11))
                productList.add(Product("iphone 11 Pro - 64 GB",899,R.drawable.iphone_11_pro))
                productList.add(Product("iphone SE - 64 GB",399,R.drawable.iphone_se))
                productList.add(Product("iphone 12 - 64 GB",799,R.drawable.iphone12))
                productList.add(Product("iphone 12 Pro - 64 GB",999,R.drawable.iphone12_pro))
            }
            2 ->{
                productList.add(Product("MacBook Pro 13.3\" Laptop",1199,R.drawable.laptop_macpro))

            }
            else ->{
                productList.add(Product("HP-4GB Memory",399,R.drawable.desktop_hp))
            }
        }
    }

    companion object {

        @JvmStatic
        fun newInstance(catId: Int) =
            ProductListFragment().apply {
                arguments = Bundle().apply {
                    putInt(Category.KEY_Cat_ID, catId)

                }
            }
    }
}