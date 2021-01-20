package com.donbrody.customkeyboard

object Util {
    fun String.matcher(): String {
        val stringBuilder = StringBuilder()
        stringBuilder.clear()
        loop@ for (word in this){
            val s = when(word) {
                '0' -> "零"
                '1' -> "一"
                '2' -> "二"
                '3' -> "三"
                '4' -> "四"
                '5' -> "五"
                '6' -> "六"
                '7' -> "七"
                '8' -> "八"
                '9' -> "九"
                else -> word.toString()
            }
            stringBuilder.append(s)
        }
        return stringBuilder.toString()
    }




}