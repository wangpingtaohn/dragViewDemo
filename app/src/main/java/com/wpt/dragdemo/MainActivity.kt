package com.wpt.dragdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initView()
    }

    private fun initView(){
        btn_hide.setOnClickListener {
            drag_view.hide()
        }

        btn_show.setOnClickListener {
            drag_view.show()
        }
    }
}
