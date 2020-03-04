package encapsulation

class Cubic(var width : Int = 100, var height : Int = 50, var length : Int = 45) {

    var volume : Int
    get() = width * height * length
    private set(value) {height = (value * 1000)/(width*length)}

//    fun volume() = width * height * length
}