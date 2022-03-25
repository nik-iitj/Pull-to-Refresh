package com.example.pulltorefresh

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class NumAdapter(var context: Context, var arrayList: ArrayList<NumList> ) :BaseAdapter() {
    override fun getCount(): Int {
        return arrayList.size
    }

    override fun getItem(p0: Int): Any {
        return arrayList[p0]
    }

    override fun getItemId(p0: Int): Long {
        return p0.toLong()
    }

    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        val view: View = View.inflate(context, R.layout.cards,null)
        val num:TextView = view.findViewById(R.id.number)

        val currNum: NumList = arrayList[p0]

        num.text = currNum.Num.toString()

        return view
    }


}