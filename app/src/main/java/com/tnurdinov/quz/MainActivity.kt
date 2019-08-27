package com.tnurdinov.quz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatTextView

class MainActivity : AppCompatActivity(), View.OnClickListener {

    lateinit var textView: AppCompatTextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView = findViewById(R.id.text_view)

        textView.text = "What is after Nitrogen and Oxygen the most common constituent (about 0.9%) of dry air?"

        findViewById<AppCompatButton>(R.id.button1).apply {
            setOnClickListener(this@MainActivity)
            text = "Helium"
        }
        findViewById<AppCompatButton>(R.id.button2).apply {
            setOnClickListener(this@MainActivity)
            text = "Argon"
        }
        findViewById<AppCompatButton>(R.id.button3).apply {
            setOnClickListener(this@MainActivity)
            text = "Carbon Dioxide"
        }
        findViewById<AppCompatButton>(R.id.button4).apply {
            setOnClickListener(this@MainActivity)
            text = "Neon"
        }
    }

    override fun onClick(view: View?) {
        view?.let {
            when(it.id) {
                R.id.button1 -> Log.d("TAG", "tapper")
                else -> Log.d("TAG", "esle")
            }
        }

    }
}
