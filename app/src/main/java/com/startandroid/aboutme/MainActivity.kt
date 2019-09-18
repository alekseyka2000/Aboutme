package com.startandroid.aboutme


import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {

    private lateinit var  binding: com.startandroid.aboutme.databinding.ActivityMainBinding

    private val nameClass: DataNameClass = DataNameClass("Aleksey", " \n" +
            "Let me introduce myself.\n\n My full name is Yarokhovich Aleksey.\n\n" +
            "I was born on Luninec. Graduated BSUIR in 2017.....\n\n Another information about person.")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.dataName = nameClass
        binding.button.setOnClickListener{
            showInformation()
        }
    }

    private fun showInformation() {
        binding.apply {
            button.visibility = View.GONE
            textView.visibility = View.GONE
            scrollView.visibility = View.VISIBLE
        }
    }
}
