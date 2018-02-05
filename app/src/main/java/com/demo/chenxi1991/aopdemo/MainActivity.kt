package com.demo.chenxi1991.aopdemo

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import com.demo.chenxi1991.aoplibrary.apt.TestAnnotation
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn.setOnClickListener { onClick() }
    }

    @TestAnnotation("注解参数")
    private fun onClick(){
        Log.i("chenxi","normalContent")
    }
}
