package com.example.tauseef.tmc.activity

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import com.example.tauseef.tmc.R
import com.example.tauseef.tmc.adapter.ShiftsBottomListAdapter
import com.example.tauseef.tmc.listener.ShiftsDragListener
import kotlinx.android.synthetic.main.activity_shifts.*
import kotlinx.android.synthetic.main.shift_sections.view.*
import java.util.stream.Collectors.toList
import kotlin.coroutines.experimental.coroutineContext

class ShiftsActivity : AppCompatActivity() {
    public val context: Context = this

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shifts)
        val bottomListLayoutManager: RecyclerView.LayoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        val shiftsLayoutManager: RecyclerView.LayoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        val bottomListAdapter: ShiftsBottomListAdapter = ShiftsBottomListAdapter(getDummyData());
        var bottomListRecyclerView: RecyclerView = findViewById(R.id.bottom_list_recycler_view)

        bottomListRecyclerView.adapter = bottomListAdapter
        bottomListRecyclerView.layoutManager = bottomListLayoutManager

        val morningDutiesList: RecyclerView = include2.shift_section_reycler_ciew
        val afternoonDutiesList: RecyclerView = include2.shift_section_reycler_ciew
        val nightDutiesList: RecyclerView = include2.shift_section_reycler_ciew
        val omLeaveList: RecyclerView = include2.shift_section_reycler_ciew
        val hospitalDutiesList: RecyclerView = include2.shift_section_reycler_ciew
        val GCrewDutiesList: RecyclerView = include2.shift_section_reycler_ciew
        val tempDutiesList: RecyclerView = include2.shift_section_reycler_ciew
        val securityDutiesList: RecyclerView = include2.shift_section_reycler_ciew

        morningDutiesList.adapter = bottomListAdapter
        afternoonDutiesList.adapter = bottomListAdapter
        nightDutiesList.adapter = bottomListAdapter
        omLeaveList.adapter = bottomListAdapter
        hospitalDutiesList.adapter = bottomListAdapter
        GCrewDutiesList.adapter = bottomListAdapter
        tempDutiesList.adapter = bottomListAdapter
        securityDutiesList.adapter = bottomListAdapter

        morningDutiesList.layoutManager = shiftsLayoutManager
        afternoonDutiesList.layoutManager = shiftsLayoutManager
        nightDutiesList.layoutManager = shiftsLayoutManager
        omLeaveList.layoutManager = shiftsLayoutManager
        hospitalDutiesList.layoutManager = shiftsLayoutManager
        GCrewDutiesList.layoutManager = shiftsLayoutManager
        tempDutiesList.layoutManager = shiftsLayoutManager
        securityDutiesList.layoutManager = shiftsLayoutManager

        morningDutiesList.setOnDragListener(ShiftsDragListener())
        afternoonDutiesList.setOnDragListener(ShiftsDragListener())
        nightDutiesList.setOnDragListener(ShiftsDragListener())
        omLeaveList.setOnDragListener(ShiftsDragListener())
        hospitalDutiesList.setOnDragListener(ShiftsDragListener())
        GCrewDutiesList.setOnDragListener(ShiftsDragListener())
        tempDutiesList.setOnDragListener(ShiftsDragListener())
        securityDutiesList.setOnDragListener(ShiftsDragListener())


    }

    fun getDummyData(): MutableList<Array<String>> {
        val aList: MutableList<Array<String>> = mutableListOf<Array<String>>(arrayOf("AWO", "Naeem"))
        aList.add(arrayOf("CT", "Aamir"))
        aList.add(arrayOf("ST", "Waheed"))
        aList.add(arrayOf("Cpl/T", "Tauseef"))
        aList.add(arrayOf("Cpl/T", "Sajid"))
        return aList;
    }


}

