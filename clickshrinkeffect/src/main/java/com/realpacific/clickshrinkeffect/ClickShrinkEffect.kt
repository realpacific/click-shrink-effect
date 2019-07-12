package com.realpacific.clickshrinkeffect

import android.animation.Animator
import android.animation.ObjectAnimator
import android.animation.PropertyValuesHolder
import android.view.MotionEvent
import android.view.View
import java.lang.ref.WeakReference

private const val SHRINK_VALUE = 0.93f

class ClickShrinkEffect(view: View) {

    private val weakRefView = WeakReference(view)

    init {
        if (!view.hasOnClickListeners()) view.setOnClickListener { }
        view.setOnTouchListener { _, event ->
            when (event.action) {
                MotionEvent.ACTION_DOWN -> buildShrinkAnimator()?.start()
                MotionEvent.ACTION_UP -> buildGrowAnimator()?.start()
            }
            return@setOnTouchListener false
        }
    }

    private fun buildShrinkAnimator(): Animator? {
        val scaleX = PropertyValuesHolder.ofFloat(View.SCALE_X, 1f, SHRINK_VALUE)
        val scaleY = PropertyValuesHolder.ofFloat(View.SCALE_Y, 1f, SHRINK_VALUE)
        weakRefView.get()?.apply {
            val animator = ObjectAnimator.ofPropertyValuesHolder(this, scaleX, scaleY)
            animator.duration = 100
            return animator
        }
        return null
    }


    private fun buildGrowAnimator(): Animator? {
        val scaleX = PropertyValuesHolder.ofFloat(View.SCALE_X, SHRINK_VALUE, 1f)
        val scaleY = PropertyValuesHolder.ofFloat(View.SCALE_Y, SHRINK_VALUE, 1f)
        weakRefView.get()?.apply {
            val animator = ObjectAnimator.ofPropertyValuesHolder(this, scaleX, scaleY)
            animator.duration = 100
            return animator
        }
        return null
    }
}

fun View.applyClickShrink(): View {
    return this.apply {
        ClickShrinkEffect(this)
    }
}