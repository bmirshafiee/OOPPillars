package inheritance

class SportsCar :Car(){

    var color : String = "red"

    fun calculateSpeed(){}

    override fun calculateSpeed(speed: Int): Int {
        return speed*3
    }
}