package com.shiqiliu.onlineshoppingpractice.Adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.shiqiliu.onlineshoppingpractice.Fragment.ProductListFragment
import com.shiqiliu.onlineshoppingpractice.Modules.Category

class AdapterFragment(fm: FragmentManager) : FragmentPagerAdapter(fm) {
    var mFragment: ArrayList<Fragment> = ArrayList()
    var mTitle: ArrayList<String> = ArrayList()

    fun addFragment(category: Category){
        mTitle.add(category.catName)
        mFragment.add(ProductListFragment.newInstance(category.catId))
    }


    override fun getCount(): Int {
       // return 3
        return mFragment.size
    }

    override fun getItem(position: Int): Fragment {
//        return when (position) {
//            0 -> MobileFragment()
//            1 -> LaptopFragment()
//            else -> DesktopFragment()
//        }
        return mFragment[position]
    }

    override fun getPageTitle(position: Int): CharSequence? {
//        return when (position) {
//            0 -> "Mobile"
//            1 -> "Laptop"
//            else -> "Desktop"
//        }
        return mTitle[position]
    }

}