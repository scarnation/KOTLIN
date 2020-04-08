package com.example.mikotlin

import androidx.recyclerview.widget.RecyclerView
import android.widget.Adapter
import android.view.View
import android.view.ViewGroup
import android.view.LayoutInflater
import android.widget.TextView

class recyclerViewAdapter(val userList: ArrayList<userDataModel>) :
    RecyclerView.Adapter<recyclerViewAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder(
        var view = LayoutInflater.from(parent.context).inflate(R.layout.tata,parent,false)
        return ViewHOLDER(view)
    )
    override fun getItemCount(): Int (
        return userList.size
    )
    override fun onBindViewHolder(holder: ViewHolder, position: Int) (
        var user:userDataModel = userList[position]
        holder.title.text = user.title
        holder.tile.text = user.tile


    class ViewHolder(tata: View) : RecyclerView(tata)(
        var title:TextView = tata.findViewById(R.id.tvTitle)
        var tile:TextView = tata.findViewById(R.id.tvTile)

    )
}