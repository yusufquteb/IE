package com.my.iengineer1.ui.calculations.concrete

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.my.iengineer1.core.base.BaseViewModel
import com.my.iengineer1.domain.engine.concrete.RCBeamEngine
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class RCBeamViewModel @Inject constructor() : BaseViewModel() {

    private val _result = MutableLiveData<RCBeamEngine.Result?>()
    val result: LiveData<RCBeamEngine.Result?> get() = _result

    fun calculate(input: RCBeamEngine.Input) {
        launch { _result.postValue(RCBeamEngine.calculate(input)) }
    }
}
