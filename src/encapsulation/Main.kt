package encapsulation

fun main(){
    createCubic()
}

fun createCubic(){

    val myCubic = Cubic(10, 20, 30)

    println("myCubic volume is : ${myCubic.volume}")

    println("myCubic height is : ${myCubic.height}")
}
