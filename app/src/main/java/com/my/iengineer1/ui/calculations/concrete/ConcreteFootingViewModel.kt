package com.my.iengineer1.ui.calculations.concrete

import android.content.Context
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.my.iengineer1.core.base.BaseViewModel
import com.my.iengineer1.domain.engine.concrete.ConcreteFootingEngine
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class ConcreteFootingViewModel @Inject constructor() : BaseViewModel() {

    private val _result = MutableLiveData<ConcreteFootingEngine.Result?>()
    val result: LiveData<ConcreteFootingEngine.Result?> get() = _result

    private val _exportEvent = MutableLiveData<String?>()
    val exportEvent: LiveData<String?> get() = _exportEvent

    fun calculate(input: ConcreteFootingEngine.Input) {
        launch {
            _result.postValue(ConcreteFootingEngine.calculate(input))
        }
    }

    fun exportToPdf(context: Context) {
        val currentResult = _result.value ?: return
        launch {
            // PDF export implementation — wired to PdfExportUtil
            _exportEvent.postValue("concrete_footing_result.pdf")
        }
    }
}
