package inheritance

open class Car : Vehicle(){

    var numberOfPassengers : Int = 3

    override fun calculateSpeed(speed: Int): Int {
        return speed*2
    }
}