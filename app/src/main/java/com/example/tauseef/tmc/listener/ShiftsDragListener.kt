package com.example.tauseef.tmc.listener

import android.view.DragEvent
import android.view.View
import android.view.View.OnDragListener

class ShiftsDragListener :  OnDragListener{
    override fun onDrag(v: View?, event: DragEvent?): Boolean {
        when (DragEvent){
            DragEvent.ACTION_DRAG_STARTED -> {}
            DragEvent.ACTION_DRAG_ENTERED ->{}

        }
        return true
    }
}