package com.furkanekiz.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ACMainViewModel : ViewModel() {
    var count = MutableLiveData<Int>()

    /*
        fun getCurrentCount(): Int{
            return count
        }

     */
    init {
        count.value = 0
    }

    /*
    fun getUpdatedCount(): Int {
        return ++count
    }

     */

    fun updateCount() {
        count.value = (count.value)?.plus(1)
    }
}