package com.example.tap_layout

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

//FragmentStateAdapter 상속 -> fragmentActivity import
class FragmentAdapter(fragmentActivity: FragmentActivity) : FragmentStateAdapter(fragmentActivity) {
    var fragmentList = listOf<Fragment>() // 개수가 변하지 않을때 listOf사용
    //어댑터가 화면에 보여줄 전체 프래그먼트 개수를 반환해야함
    override fun getItemCount(): Int {
        return fragmentList.size
    }

    //현재 페이지의 position이 파라미터로 넘어온다. position에 해당하는 위치의 프래그먼트를 만들어서 안드로이드에 반환해야함
    //getItem으로 요청되는 페이지의 position이 넘어온다. 해당 position에 있는 프래그먼트 하나를 리턴함
    override fun createFragment(position: Int): Fragment {
        return fragmentList.get(position)
    }

}