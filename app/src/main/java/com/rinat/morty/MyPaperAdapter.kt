package com.rinat.morty

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class MyPagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {

    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> FragmentOne()
            1 -> FragmentTwo()
            else -> Fragment()
        }
    }

    override fun getCount(): Int {
        return 2 // Количество вкладок
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return when (position) {
            0 -> "Вкладка 1"
            1 -> "Вкладка 2"
            else -> null
        }
    }
}