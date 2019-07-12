package com.realpacific.clickshrinkdemo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.realpacific.clickshrinkeffect.applyClickShrink
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.applyClickShrink()
        fab.applyClickShrink()
        card_view.applyClickShrink()
        textview.applyClickShrink()
        image_view.applyClickShrink()
    }
}
