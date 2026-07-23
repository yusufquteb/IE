package com.my.iengineer1.ui.calculations.roads

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.my.iengineer1.core.base.BaseViewModel
import com.my.iengineer1.domain.engine.roads.AsphaltLayersEngine
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class AsphaltViewModel @Inject constructor() : BaseViewModel() {

    private val _result = MutableLiveData<AsphaltLayersEngine.Result?>()
    val result: LiveData<AsphaltLayersEngine.Result?> get() = _result

    fun calculate(input: AsphaltLayersEngine.Input) {
        launch {
            _result.postValue(AsphaltLayersEngine.calculate(input))
        }
    }
}
