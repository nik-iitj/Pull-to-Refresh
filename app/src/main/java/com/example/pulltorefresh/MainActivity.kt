package com.example.pulltorefresh

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout

class MainActivity : AppCompatActivity() {


    private var listView: ListView?=null
    private var numAdapter: NumAdapter?=null
    private var arrayList: ArrayList<NumList>?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        listView = findViewById(R.id.listItem)
        arrayList = ArrayList()
        numAdapter = NumAdapter(applicationContext,arrayList!!)
        listView?.adapter = numAdapter

        arrayList!!.add(NumList(1))





        val pullToRefresh = findViewById<SwipeRefreshLayout>(R.id.pullToRefresh)

        pullToRefresh.setOnRefreshListener {

            arrayList!!.add(NumList(arrayList!!.size+1))
            numAdapter!!.notifyDataSetChanged()

            pullToRefresh.isRefreshing = false

        }

    }

}