package com.example.fragment_ex

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.setFragmentResult
import androidx.fragment.app.setFragmentResultListener
import com.example.fragment_ex.databinding.FragmentListBinding
import com.example.fragment_ex.databinding.FragmentReciveBinding

class ReciveFragment : Fragment() {
    lateinit var binding : FragmentReciveBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentReciveBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //값을 보내는 측 프래그먼트에서 "request"라는 키로 값을 보내면 리스너 안의 코드가 실행된다.
        //"request는 요청 전체에 대한 키"
        setFragmentResultListener("request"){
            key,bundle -> bundle.getString("valueKey")?.let {
                binding.texxtView.setText(it)
        }
        }
    }
}
