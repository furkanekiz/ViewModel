package com.furkanekiz.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ACMainViewModel : ViewModel() {
    private var count = MutableLiveData<Int>()
    val countData: LiveData<Int>
    get() = count

    init {
        count.value = 0
    }

    /*
        fun getCurrentCount(): Int{
            return count
        }

     */


    /*
    fun getUpdatedCount(): Int {
        return ++count
    }

     */

    fun updateCount() {
        count.value = (count.value)?.plus(1)
    }
}