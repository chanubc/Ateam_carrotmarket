package com.softsquared.template.kotlin.src.main.myPage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.softsquared.template.kotlin.R
import com.softsquared.template.kotlin.databinding.ActivityDetailPageBinding

class detailPageActivity : AppCompatActivity() {
    lateinit var binding:ActivityDetailPageBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityDetailPageBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        adddata()
    }

    private fun adddata() {
        /*binding.detailPageTvTitle.text = intent.getStringExtra("title")
        binding.detailPageTvContent.text = intent.getStringExtra("content")*/
    }
}