package com.my.iengineer1.ui.calculations.concrete

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.my.iengineer1.core.base.BaseViewModel
import com.my.iengineer1.domain.engine.concrete.ConcreteSlabEngine
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class ConcreteSlabViewModel @Inject constructor() : BaseViewModel() {

    private val _result = MutableLiveData<ConcreteSlabEngine.Result?>()
    val result: LiveData<ConcreteSlabEngine.Result?> get() = _result

    fun calculate(input: ConcreteSlabEngine.Input) {
        launch { _result.postValue(ConcreteSlabEngine.calculate(input)) }
    }
}
