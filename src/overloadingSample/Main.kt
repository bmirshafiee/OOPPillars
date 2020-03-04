package overloadingSample

fun main(){
    createCalculateInstance()
}

fun createCalculateInstance(){
    val calculate = Calculation()

    val firstPoly1 = calculate.add(1,2)
    val firstPoly2 = calculate.add(1, 2, 3)

    val secondPoly = calculate.add(1, 5.9f)

    val thirdPoly = calculate.add(1.2f, 3)
    println("first case overloading : $firstPoly1 " + "and" + " $firstPoly2")
    println("second case overloading : $secondPoly")
    println("third case overloading : $thirdPoly")


}