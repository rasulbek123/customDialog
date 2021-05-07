package com.example.customdialog

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item.view.*

class ListViewHolder(itemView:View):RecyclerView.ViewHolder(itemView) {
    fun Populeatmodel(user: User){
        itemView.userName.text = user.Name
        itemView.userLastname.text = user.LastName
    }
}