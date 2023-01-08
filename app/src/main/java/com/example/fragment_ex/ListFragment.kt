package com.example.fragment_ex

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.fragment_ex.databinding.FragmentListBinding

private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

class ListFragment : Fragment() {
    var mainActivity : MainActivity? = null //메인 액티비티를 담는 변수
    override fun onCreateView(
        //inflater : 레이아웃 파일을 로드하기 위한 레이아웃 인플레이터를 기본으로 제공합니다.
        //container 액티비티의 레이아웃
        //savedInstanceState 상태 값 저장을 위한 보조 도구.
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentListBinding.inflate(inflater,container,false) // 메인 액티비티 바인딩
        binding.btnNext.setOnClickListener {
            mainActivity?.goDetail()
        }
        //넘어온 데이터 대입하는 변수
        //액티비티에서 전달한 두개의 값
        binding.textTitle.text = arguments?.getString("1")
        binding.textValue.text = arguments?.getString("2")
        //메서드의 반환 값이 view이기 때문에 root뷰를 넘겨주는 것
        return binding.root
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        if(context is MainActivity){
            mainActivity = context
        }

    }

}