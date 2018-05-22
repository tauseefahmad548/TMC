package com.example.tauseef.tmc.adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.tauseef.tmc.R

class ShiftsBottomListAdapter (val personneList:List<Array<String>>): RecyclerView.Adapter<ShiftsBottomListAdapter.VH>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ShiftsBottomListAdapter.VH {
       val view:View = LayoutInflater.from(parent.context).inflate(R.layout.shifts_bottom_list_item,parent,false)
        val vh:VH = VH(view)
        return  vh
    }

    override fun getItemCount(): Int = personneList.size

    override fun onBindViewHolder(holder: ShiftsBottomListAdapter.VH, position: Int) {
        holder.shiftslistItemRankTextView.setText(personneList.get(position)[0])
        holder.shiftsListItemNameTextView.setText(personneList.get(position)[1])
    }

    class VH(val view: View) : RecyclerView.ViewHolder(view) {
        val shiftslistItemRankTextView: TextView
        val shiftsListItemNameTextView: TextView

        init {
            shiftslistItemRankTextView = view.findViewById(R.id.shifts_list_item_name_text_view);
            shiftsListItemNameTextView = view.findViewById(R.id.shifts_list_item_rank_text_view);
        }
    }
}

