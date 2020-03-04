package overloadingSample

class Calculation {

    fun add(number1 : Int, number2 : Int) : Int {
        return number1 + number2
    }

    fun add(number1: Int, number2: Int, number3 : Int) : Int{
        return number1 + number2 + number3
    }

    fun add(number1: Int, number2: Float) : Int {
        return (number1 + number2).toInt()
    }

    fun add(number1 : Float, number2: Int) : Int{
        return (number1 + number2).toInt()
    }
}