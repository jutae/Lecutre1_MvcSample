package com.gibaram.mvcsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.gibaram.mvcsample.model.Counter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val counter = Counter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 초기값 설정
        this.numberView?.text = counter.number.toString()

        // 이벤트 핸들링
        this.increaseButton?.setOnClickListener {
            counter.increase()
            this.numberView?.text = counter.number.toString()
        }
    }
}