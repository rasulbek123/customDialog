package com.example.customdialog

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item.view.*

class ListViewHolder(itemView:View):RecyclerView.ViewHolder(itemView) {
    fun Populeatmodel(user: User,onClicked:(view:View,position:Int)->Unit,position: Int){
        itemView.userName.text = user.Name
        itemView.userLastname.text = user.LastName
    itemView.bntOptions.setOnClickListener {
        onClicked(itemView.bntOptions,position)
    }
    }
}