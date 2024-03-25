package ru.te3ka.homework02

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.LinearLayout
import ru.te3ka.homework02.databinding.CustomViewPostBinding


class CustomView(context: Context, attrs: AttributeSet?) : LinearLayout(context, attrs) {
    private val binding = CustomViewPostBinding.inflate(LayoutInflater.from(context))

    init {
        addView(binding.root)
    }

    fun setTopText(text: String) {
        binding.topText.text = text
    }

    fun setBottomText(text: String) {
        binding.bottomText.text = text
    }

}

