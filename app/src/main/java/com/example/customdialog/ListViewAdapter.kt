package com.example.customdialog

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class ListViewAdapter:RecyclerView.Adapter<ListViewHolder>() {
    var models: MutableList<User> = mutableListOf()
    set(value) {
        field = value
        notifyDataSetChanged()
    }
    fun userAdd(position: Int,etTitle:String,etDescription:String){
        models.add(User(etTitle,etDescription))
        notifyItemRangeInserted(position)
        notifyItemRangeChanged(0,position)
    }
    fun userRemove(position: Int){
        if(models.size>1){
            models.removeAt(position)
            notifyItemRemoved(position)
            notifyItemRangeChanged(0,models.size)
        }
    }
    var onClicked:(view:View,position:Int)->Unit = {view,positions->}
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        var itemView:View = LayoutInflater.from(parent.context).inflate(R.layout.item,parent,false)
        return ListViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        holder.Populeatmodel(models[position],onClicked,position+1)
    }

    override fun getItemCount(): Int {
        return models.size
    }
}