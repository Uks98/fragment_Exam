package com.example.fragment_ex

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.setFragmentResult
import com.example.fragment_ex.databinding.FragmentReciveBinding
import com.example.fragment_ex.databinding.FragmentSenderBinding

class SenderFragment : Fragment() {
    lateinit var binding : FragmentSenderBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSenderBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnYes.setOnClickListener {
        //프래그먼트 발신
            //bundle of -> key to value
            val bundle = bundleOf("valueKey" to "Yes")
            setFragmentResult("request",bundle)
        }
        binding.btnNo.setOnClickListener {
            val bundle = bundleOf("valueKey" to "No")
            setFragmentResult("request",bundle)
        }
    }

}