package inheritance

fun main(){

    createVehicle()
}

fun createVehicle(){

    val car = Car()

    println("car instance = ${car.numberOfPassengers}\n" +
            "${car.numberOfSeats}\n"+
            "${car.numberOfWheels}\n"+
            "${car.speed}\n" +
            "${car.toBeShared()}")
    val truck = Truck()

    println("truck instance = ${truck.cargo}\n"+
            "${truck.moveCargo()}\n"+
            "${truck.numberOfSeats}\n"+
            "${truck.numberOfWheels}\n"+
            "${truck.speed}"+
            "${truck.toBeShared()}")

    val sportsCar = SportsCar()

    println("sportsCar instance = ${sportsCar.numberOfPassengers}"+
    ",${sportsCar.color}" + ",${sportsCar.calculateSpeed()}" + ",${sportsCar.toBeShared()}"+
    ",${sportsCar.speed}"+",${sportsCar.numberOfSeats}"+",${sportsCar.numberOfWheels}")

    val smallTruck = SmallTruck()

    println("smallTruck instance = ${smallTruck.calculateCargo()}"+
            ",${smallTruck.toBeShared()}"+
            ",${smallTruck.speed}"+",${smallTruck.numberOfSeats}"+
            ",${smallTruck.numberOfWheels}")

    val vehicle = Vehicle()

    println("Vehicle instance = ${vehicle.speed}\n"
    +"${vehicle.numberOfWheels}\n"+
    "${vehicle.numberOfSeats}"+"${vehicle.toBeShared()}")

    println("calculateSpeed in Vehicle class : ${vehicle.calculateSpeed(10)}\n"
    +       "calculateSpeed in Car class : ${car.calculateSpeed(10)}\n"
    +       "calculateSpeed in SportCar class : ${sportsCar.calculateSpeed(10)}")
}