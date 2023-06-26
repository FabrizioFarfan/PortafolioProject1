package com.example.myfirstappproject.ui.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.myfirstappproject.data.model.ActivityModel
import com.example.myfirstappproject.domain.Activity
import com.example.myfirstappproject.domain.GetRandomActivityUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ActivityViewModel @Inject constructor(
    private val getRandomActivityUseCase : GetRandomActivityUseCase
) : ViewModel() {

    val activityModel = MutableLiveData<Activity?>()


    fun randomActivity(){
        viewModelScope.launch{
            val result = getRandomActivityUseCase()

            activityModel.postValue(result)
        }
    }



}