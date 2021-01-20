package com.donbrody.customkeyboard.components.keyboard

import android.widget.TextView
import com.donbrody.customkeyboard.components.keyboard.controllers.KeyboardController

/**
 * Created by Don.Brody on 7/19/18.
 */
interface KeyboardListener {
    fun characterClicked(c: Char,textView: TextView)
    fun textViewClicked(textView: TextView)
    fun specialKeyClicked(key: KeyboardController.SpecialKey,textView: TextView)
}