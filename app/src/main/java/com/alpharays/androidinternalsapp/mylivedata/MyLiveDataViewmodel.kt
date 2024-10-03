package com.alpharays.androidinternalsapp.mylivedata

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class MyLiveDataViewmodel:ViewModel() {
    private var counter : Int = 0
    val myDataProvider : MyLiveData<Int> = MyLiveData()

    fun runCounter(){
        viewModelScope.launch {
            while (counter<5){
                counter+=1
                myDataProvider.postValue(counter)
                delay(1000)
            }
        }
    }
}