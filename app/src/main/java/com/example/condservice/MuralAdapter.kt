package com.example.condservice

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView




class MuralAdapter (private  val comunicados : List<String>) : RecyclerView.Adapter<MuralAdapter.MuralViewHolder>(){

    class MuralViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val comunicado: TextView = itemView.findViewById(R.id.textComunicado)

    }


    override fun onCreateViewHolder(
        parent: ViewGroup,
        p1: Int
    ): MuralAdapter.MuralViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_mural, parent, false)
        return MuralViewHolder(view)
    }

    override fun onBindViewHolder(holder: MuralViewHolder, position: Int) {

        val item = comunicados[position]

        holder.comunicado.text = item

    }

    override fun getItemCount(): Int {
        return comunicados.size
    }

}