package com.example.fragment_ex

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setFragment()
    }
    fun setFragment(){
        val listFragment: ListFragment = ListFragment()
        val transaction = supportFragmentManager.beginTransaction() // 트랜잭션 시작
        // add 메서드 -> 프래그먼트를 레이아웃에 추가
        //replace 레이아웃에 삽입된 프래그먼트 교체
        //remove 프래그먼트 제거
        transaction.add(R.id.framaLayout, listFragment) //id와 프래그먼트 필요
        transaction.commit() //모든 작업 완성될 시
    }
    //프레그먼트 이동 함수
    fun goDetail(){
        var detailFragment = DetailFragment()
        val transaction = supportFragmentManager.beginTransaction()
        transaction.add(R.id.framaLayout,detailFragment)
        transaction.addToBackStack("detail")
        transaction.commit()
    }
    fun goBack(){
        onBackPressed()
    }
}