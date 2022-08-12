package com.example.tiptime

import junit.framework.Assert.assertEquals
import org.junit.Test

internal class TipCalculatorKtTest{
    @Test
    fun test1_20percent_roundUp(){
        var bill = 100.0
        var tipPercent = 20.0
        var expectedTip = "$20.00"
        val actualTip = calculateTip(amount = bill, tipPercent = tipPercent, false)
        assertEquals(expectedTip, actualTip)
    }

}