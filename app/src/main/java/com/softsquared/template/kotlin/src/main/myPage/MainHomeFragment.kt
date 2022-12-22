package com.softsquared.template.kotlin.src.main.myPage

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.softsquared.template.kotlin.R
import com.softsquared.template.kotlin.databinding.FragmentMainHomeBinding


class MainHomeFragment : Fragment() {

   lateinit var binding: FragmentMainHomeBinding
    lateinit var adapter : MainHomeAdapter
    var dataList  = ArrayList<MainHomeData>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMainHomeBinding.inflate(layoutInflater)

        // Inflate the layout for this fragment
        adddata()

        initRecyclerView()






        return binding.root
    }

    private fun initRecyclerView() {

        //기존 adapter(recyclerview adpater)
        binding.MainHomerecyclerView.layoutManager = LinearLayoutManager(context,
            LinearLayoutManager.VERTICAL, false)
        adapter = MainHomeAdapter(dataList)
        binding.MainHomerecyclerView.adapter = adapter


        adapter.itemClickListener = object :MainHomeAdapter.OnItemClickListener{
            override fun OnItemClick(data: MainHomeData) {
              /*  Toast.makeText(getActivity(),"show", Toast.LENGTH_SHORT).show()
                 val intent = packageManager.getLaunchIntentForPackage(data.appackname)
                 startActivity(intent)*/
            }
        }
    }

    private fun adddata() {
        dataList.add(MainHomeData("아이폰 11 퍼플 색상","반포동","325,000원","1"))
        dataList.add(MainHomeData("아이폰 11 퍼플 색상","반포동","325,000원","1"))
        dataList.add(MainHomeData("아이폰 11 퍼플 색상","반포동","325,000원","1"))
        dataList.add(MainHomeData("아이폰 11 퍼플 색상","반포동","325,000원","1"))
        dataList.add(MainHomeData("아이폰 11 퍼플 색상","반포동","325,000원","1"))
        dataList.add(MainHomeData("아이폰 11 퍼플 색상","반포동","325,000원","1"))
        dataList.add(MainHomeData("아이폰 11 퍼플 색상","반포동","325,000원","1"))

    }


}