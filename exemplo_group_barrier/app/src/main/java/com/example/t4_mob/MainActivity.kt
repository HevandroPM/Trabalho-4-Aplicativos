package com.example.t4_mob

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.constraintlayout.widget.Group

lateinit var bt_inv:Button
lateinit var bt_vis: Button
lateinit var btns: Group

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bt_inv = findViewById(R.id.bt_inv)
        bt_vis = findViewById(R.id.bt_visivel)
        btns = findViewById(R.id.btn_gp)

        bt_inv.setOnClickListener {
            btns.visibility = View.GONE
        }

        bt_vis.setOnClickListener {
            btns.visibility = View.VISIBLE
        }
    }
}