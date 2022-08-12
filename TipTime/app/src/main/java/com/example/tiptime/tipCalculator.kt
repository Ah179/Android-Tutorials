package com.example.tiptime

import java.text.NumberFormat


    fun calculateTip(amount: Double, tipPercent: Double = 15.0, roundUp: Boolean): String{
        var tip = 0.0
        tip = amount * (tipPercent/100)
        if(roundUp){
            tip = kotlin.math.ceil(tip)
        }
        return NumberFormat.getCurrencyInstance().format(tip)
    }
