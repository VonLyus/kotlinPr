package com.example.calculator

fun main(){

    val Calculation = calculator()

    val setFirstNumber : Int = readInt("첫 번째 숫자를 입력하세요: ")
    val setSecondNumber : Int = readInt("두 번째 숫자를 입력하세요: ")
    val operator = readOperator("덧셈, 뺄셈, 곱셈, 나눗셈, 나머지 중에서 입력해주세요. (ex : + - *  / %): ")

    var ResultNumber : Int = 0

    ResultNumber = Calculation.calculator(operator, setFirstNumber, setSecondNumber)
    if (ResultNumber != null) {
        println("결과: $ResultNumber")
    }

}

fun readInt(message: String): Int {
    print(message)
    return readLine()?.toIntOrNull() ?: run {
        println("올바른 숫자를 입력하세요.")
        readInt(message)
    }
}


fun readOperator(message: String): Char {
    print(message)
    val operator = readLine()?.trim()?.singleOrNull()

    return when (operator) {
        '+', '-', '*', '/' -> operator
        else -> {
            println("올바른 연산자를 입력하세요.")
            readOperator(message)
        }
    }
}