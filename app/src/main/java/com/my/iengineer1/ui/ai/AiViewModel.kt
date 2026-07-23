package com.my.iengineer1.ui.ai

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.my.iengineer1.core.base.BaseViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class AiViewModel @Inject constructor() : BaseViewModel() {

    private val _messages = MutableLiveData<List<ChatMessage>>(emptyList())
    val messages: LiveData<List<ChatMessage>> get() = _messages

    private val _isLoading = MutableLiveData(false)
    val isLoading: LiveData<Boolean> get() = _isLoading

    private val _error = MutableLiveData<String?>()
    val error: LiveData<String?> get() = _error

    fun sendMessage(content: String) {
        val current = _messages.value.orEmpty().toMutableList()
        current.add(ChatMessage(content, isUser = true))
        _messages.value = current
        _isLoading.value = true

        launch {
            // AI API call — wire Retrofit here when API key is configured
            kotlinx.coroutines.delay(500)
            val reply = generateLocalResponse(content)
            val updated = _messages.value.orEmpty().toMutableList()
            updated.add(ChatMessage(reply, isUser = false))
            _messages.postValue(updated)
            _isLoading.postValue(false)
        }
    }

    private fun generateLocalResponse(question: String): String {
        return when {
            question.contains("footing", ignoreCase = true) ||
            question.contains("أساس", ignoreCase = true) ->
                "يمكنك استخدام حاسبة الفوتينج المعزز في قسم الخرسانة. تحتاج إلى: حمل العمود (kN)، طاقة التحمل، درجة الخرسانة والصلب."
            question.contains("slope", ignoreCase = true) ||
            question.contains("ميلان", ignoreCase = true) ->
                "الميلان الأدنى للصرف الصحي وفق المعايير هو 1:200 (5‰). للمناطق السكنية يُفضل 1:100."
            question.contains("asphalt", ignoreCase = true) ||
            question.contains("أسفلت", ignoreCase = true) ->
                "طبقات الأسفلت القياسية: طبقة الرابط (بيندر) 5-7 سم، الطبقة السطحية (ويرنج) 3-5 سم، طبقة الأساس الحجري 20-30 سم."
            else ->
                "يمكنني مساعدتك في حسابات الهندسة المدنية. اسألني عن: الخرسانة، الطرق، الصرف الصحي، أو أي حساب هندسي آخر."
        }
    }
}
