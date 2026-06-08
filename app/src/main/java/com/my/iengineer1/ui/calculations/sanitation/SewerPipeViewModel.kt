package com.my.iengineer1.ui.calculations.sanitation

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.my.iengineer1.core.base.BaseViewModel
import com.my.iengineer1.domain.engine.sanitation.SewerPipeEngine
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class SewerPipeViewModel @Inject constructor() : BaseViewModel() {

    private val _result = MutableLiveData<SewerPipeEngine.Result?>()
    val result: LiveData<SewerPipeEngine.Result?> get() = _result

    fun calculate(input: SewerPipeEngine.Input) {
        launch {
            _result.postValue(SewerPipeEngine.calculate(input))
        }
    }
}
