package com.my.iengineer1.ui.ai

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.my.iengineer1.core.base.BaseFragment
import com.my.iengineer1.core.extensions.toast
import com.my.iengineer1.databinding.FragmentAiBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class AiAssistantFragment : BaseFragment<FragmentAiBinding>() {

    private val viewModel: AiViewModel by viewModels()

    override fun inflateBinding(inflater: LayoutInflater, container: ViewGroup?) =
        FragmentAiBinding.inflate(inflater, container, false)

    override fun setupViews() {
        binding.btnSend.setOnClickListener {
            val message = binding.etMessage.text?.toString()?.trim() ?: return@setOnClickListener
            if (message.isEmpty()) return@setOnClickListener
            viewModel.sendMessage(message)
            binding.etMessage.setText("")
        }
    }

    override fun observeViewModel() {
        viewModel.messages.observe(viewLifecycleOwner) { messages ->
            binding.rvChat.adapter = ChatAdapter(messages)
            binding.rvChat.scrollToPosition(messages.size - 1)
        }
        viewModel.isLoading.observe(viewLifecycleOwner) { loading ->
            binding.btnSend.isEnabled = !loading
        }
        viewModel.error.observe(viewLifecycleOwner) { error ->
            if (error != null) toast(error)
        }
    }
}
