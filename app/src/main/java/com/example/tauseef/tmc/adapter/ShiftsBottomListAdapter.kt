package com.example.tauseef.tmc.adapter

import android.content.ClipData
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.tauseef.tmc.R
import com.example.tauseef.tmc.database.CurrentShiftsRecord

class ShiftsBottomListAdapter(val shiftsList: List<CurrentShiftsRecord>) : RecyclerView.Adapter<ShiftsBottomListAdapter.VH>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ShiftsBottomListAdapter.VH {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.shifts_bottom_list_item, parent, false)
        val vh: VH = VH(view)
        return vh
    }

    override fun getItemCount(): Int = shiftsList.size

    override fun onBindViewHolder(holder: ShiftsBottomListAdapter.VH, position: Int) {
        holder.shiftsListItemPakTextView.setText(shiftsList.get(position).pak)
        holder.shiftslistItemRankTextView.setText(shiftsList.get(position).rank)
        holder.shiftsListItemNameTextView.setText(shiftsList.get(position).name)
        val clipString:String = "${shiftsList.get(position).pak} ${shiftsList.get(position).rank} ${shiftsList.get(position).name}"
        holder.view.setOnLongClickListener() { v ->
            val item: ClipData.Item = ClipData.Item(clipString)
            val clipdata: ClipData = ClipData(null, item)
            v.startDrag(clipdata, View.DragShadowBuilder(holder.view), null, 0)
        }
    }

    class VH(val view: View) : RecyclerView.ViewHolder(view) {
        val shiftsListItemPakTextView: TextView
        val shiftslistItemRankTextView: TextView
        val shiftsListItemNameTextView: TextView

        init {
            shiftsListItemPakTextView = view.findViewById(R.id.shifts_list_item_pak_text_view);
            shiftslistItemRankTextView = view.findViewById(R.id.shifts_list_item_rank_text_view);
            shiftsListItemNameTextView = view.findViewById(R.id.shifts_list_item_name_text_view);
        }
    }
}

