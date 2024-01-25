import kotlin.math.*

open class Triangle(_name : String) :   Shape(_name) {
    private var side1 = 0.0
    private var side2 = 0.0
    private var side3 = 0.0

    fun setDimensions(_side1 : Double, _side2 :Double,_side3 : Double){
        side1 = _side1
        side2 = _side2
        side3 = _side3
    }

    override fun printDimensions() {
        println("$name has sides with lengths: $side1, $side2, and $side3")
    }

    override fun getArea(): Double {
        val s = (side1+side2+side3)/2 //1/2 the perimeter
        val area = sqrt(s*(s-side1)*(s-side2)*(s-side3)) //heron's formula
        return area
    }
}