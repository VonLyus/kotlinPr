package com.example.calculator

class DivOperation : AbstractOperation(){
    override fun operate(num1: Int, num2: Int): Double = if (num2 != 0) num1.toDouble() / num2.toDouble() else Double.NaN
}