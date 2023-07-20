package com.example.calculator

class calculator {

    var resultNumber : Int = 0


    val add = AddOperation()
    val sub = SubOperation()
    val mul = MulOperation()
    val div = DivOperation()
    val rest = RestOperation()

    var addJud = '+'
    var subJud = '-'
    var mulJud = '*'
    var divJud = '/'
    var restJud = '%'

    fun calculator(operator: Char, setFirstNumber: Int, setSecondNumber: Int) : Int {

        if (operator.equals(addJud)) {
            resultNumber = add.operate(setFirstNumber,setSecondNumber).toInt()
            // 덧셈일 때
        } else if (operator.equals(subJud)) {
            resultNumber = sub.operate(setFirstNumber,setSecondNumber).toInt()
            // 뺄셈일 때
        } else if(operator.equals(mulJud)) {
            resultNumber = mul.operate(setFirstNumber,setSecondNumber).toInt()
            // 곱셈일 때
        } else if(operator.equals(divJud)) {
            resultNumber = div.operate(setFirstNumber,setSecondNumber).toInt()
            // 나눗셈일 때
        }
//        else if(operator.equals(restJud)){
//            resultNumber = div.operate(setFirstNumber,setSecondNumber).toInt()
//        }
        return resultNumber
    }




}
