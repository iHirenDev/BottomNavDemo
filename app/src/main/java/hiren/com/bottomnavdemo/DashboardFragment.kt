package hiren.com.bottomnavdemo

import android.content.Intent
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ListView
import org.jetbrains.anko.toast


class DashboardFragment:Fragment() {

    private lateinit var listView: ListView


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.dash_fragment, container, false)
        listView = view.findViewById(R.id.listView)
        val jobList = arrayOf("India","Australia","USA","Germany","U.K.",
                "Austria","Mexico","Pakistan","Sri Lanka","Iraq","Iran",
                "South Africa","Nepal","China","Japan","Russia","Bangladesh",
                "Singapore")
        val adapter = ArrayAdapter(activity,android.R.layout.simple_list_item_1,jobList)
        listView.adapter = adapter

        listView.isClickable = true


        listView.setOnItemClickListener { _, _, position, _ ->

        }


        return view
    }

    companion object {
        fun newInstance(): DashboardFragment = DashboardFragment()
    }
}