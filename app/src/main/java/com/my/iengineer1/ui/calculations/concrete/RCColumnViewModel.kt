package com.my.iengineer1.ui.calculations.concrete

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.my.iengineer1.core.base.BaseViewModel
import com.my.iengineer1.domain.engine.concrete.RCColumnEngine
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class RCColumnViewModel @Inject constructor() : BaseViewModel() {

    private val _result = MutableLiveData<RCColumnEngine.Result?>()
    val result: LiveData<RCColumnEngine.Result?> get() = _result

    fun calculate(input: RCColumnEngine.Input) {
        launch { _result.postValue(RCColumnEngine.calculate(input)) }
    }
}
