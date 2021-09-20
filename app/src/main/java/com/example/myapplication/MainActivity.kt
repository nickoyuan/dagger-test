package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import javax.inject.Inject

class MainActivity : AppCompatActivity(), CounterView {

    var count : Int = 0
    lateinit var counterText : TextView

    @Inject
    lateinit var presenter : CounterPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        val application = application as MyApplication
        application.component.inject(this)

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        presenter.attachView(this)

        val button : Button = findViewById(R.id.button_id)
        counterText = findViewById(R.id.countText)
        counterText.text = count.toString()
        button.setOnClickListener { presenter.incrementNumberAndUpdateOnView(count) }

    }

    override fun updateViewWithCount(updatedCount: Int) {
        count = updatedCount
        counterText.text = count.toString()
    }

}