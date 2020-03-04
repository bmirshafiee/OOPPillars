package abstraction

import javax.print.DocFlavor

abstract class Car{
    abstract val color : String
}

class CarA : Car(), CarAction {
    override val color: String = "Red"
    override fun speedUp() = "Car A is moving"
}

class CarB : Car(), CarAction {
    override val color: String
        get() = "Blue"

    override fun speedUp() = "Car B is moving"
}
interface CarAction{
    fun speedUp() : String
}