package abstraction

fun main(){
    createCar()
}

fun createCar(){
    val carA = CarA()
    val carB = CarB()

    println("carA color is : ${carA.color}")
    println("carB color is : ${carB.color}")

    println("CarA moving is : ${carA.speedUp()}")
    println("CarB moving is : ${carB.speedUp()}")
}

fun moveCar(car : CarAction){
    car.speedUp()
}