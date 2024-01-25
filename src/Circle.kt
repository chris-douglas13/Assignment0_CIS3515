class Circle(_name : String) : Shape(_name)  {
    private var radius = 0.0

    fun setDimensions(_radius : Double){
        radius = _radius
    }

    override fun printDimensions() {
        println("$name has radius: $radius")
    }

    override fun getArea() :Double{
        val area = 3.14*radius*radius
        return area
    }
}