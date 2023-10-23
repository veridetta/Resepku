package com.azhar.resepku.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.azhar.resepku.R
import com.azhar.resepku.model.ModelIngredients


class IngredientsAdapter(private val modelIngredients: List<ModelIngredients>) :
        RecyclerView.Adapter<IngredientsAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_ingredients, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val data = modelIngredients[position]
        holder.tvIngredients.text = data.strIngredient
    }

    override fun getItemCount(): Int {
        return modelIngredients.size
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvIngredients: TextView

        init {
            tvIngredients = itemView.findViewById(R.id.tvIngredients)
        }
    }
}