package com.example.customdialog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.PopupMenu
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var adapter = ListViewAdapter()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
        setData(1)
    }
    fun setData(count:Int){
        var models:MutableList<User> = mutableListOf()
        for(i in 0 until count){
            var model:User = User("User name","User lastname")
            models.add(model)
        }
        adapter.models=models
    }
    fun onOptionsButton(view: View){
        val optionsMenu = PopupMenu(this,view)
        var menuInflater = optionsMenu.menuInflater
        menuInflater.inflate(R.menu.menu_options_item,optionsMenu.menu)
        optionsMenu.show()
    }
}