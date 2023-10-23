package com.azhar.resepku.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.azhar.resepku.R
import com.azhar.resepku.model.ModelSteps


class StepsAdapter(private val modelSteps: List<ModelSteps>) : RecyclerView.Adapter<StepsAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_steps, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val data = modelSteps[position]
        holder.tvSteps.text = data.strSteps
    }

    override fun getItemCount(): Int {
        return modelSteps.size
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvSteps: TextView

        init {
            tvSteps = itemView.findViewById(R.id.tvSteps)
        }
    }
}