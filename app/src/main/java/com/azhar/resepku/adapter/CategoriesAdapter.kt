package com.azhar.resepku.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.azhar.resepku.R
import com.azhar.resepku.activities.ListCategoriesActivity
import com.azhar.resepku.model.ModelCategories


class CategoriesAdapter(private val context: Context, private val modelCategories: List<ModelCategories>) :
        RecyclerView.Adapter<CategoriesAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_categories, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val data = modelCategories[position]
        holder.tvCategories.text = data.strKategori
        holder.relativeCategories.setOnClickListener {
            val intent = Intent(context, ListCategoriesActivity::class.java)
            intent.putExtra(ListCategoriesActivity.LIST_CATEGORIES, modelCategories[position])
            context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return modelCategories.size
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var relativeCategories: RelativeLayout
        var tvCategories: TextView

        init {
            relativeCategories = itemView.findViewById(R.id.relativeCategories)
            tvCategories = itemView.findViewById(R.id.tvCategories)
        }
    }
}