import kotlin.math.sqrt

class EquilateralTriangle(_name : String) : Shape(_name){
    private var side = 0.0

    fun setDimensions(_side : Double){
        side = _side
    }

    override fun printDimensions() {
        println("$name has side lengths:$side")
    }

    override fun getArea(): Double {
        val area = (sqrt(3.0)*side*side)/4.0
        return area
    }
}