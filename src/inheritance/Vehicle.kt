package inheritance

open class Vehicle (var speed : Int = 50, var numberOfSeats : Int = 4, var numberOfWheels : Int = 4){

    fun toBeShared(){}

    open fun calculateSpeed(speed : Int) : Int{
        return speed
    }
}