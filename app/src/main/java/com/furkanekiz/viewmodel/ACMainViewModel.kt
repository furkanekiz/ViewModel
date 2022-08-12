package com.furkanekiz.viewmodel

import androidx.lifecycle.ViewModel

class ACMainViewModel : ViewModel(){
    private var count = 0

    fun getCurrentCount(): Int{
        return count
    }

    fun getUpdatedCount(): Int{
        return ++count
    }
}