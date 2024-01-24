class Square(_name : String) : Shape(_name) {
    private var length = 0.0
    private var height = 0.0

    fun setDimensions(_length : Double, _height :Double){
        length = _length
        height = _height

    }

    override fun printDimensions() {
        println("$name has length: $length and height: $height.")
    }

    override fun getArea(): Double {
        val area = length*height
        return area
    }
}