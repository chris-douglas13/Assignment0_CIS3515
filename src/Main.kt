import kotlin.math.*
import java.util.Scanner

fun main() {
    /// Beginning of Square Object ///
    val square1 : Shape
    square1 = Square("Square1")

    val reader = Scanner(System.`in`)

    print("Enter the length of the square: ")
    var length : Double = reader.nextDouble()
    print("Enter the height of the square: ")
    var height : Double = reader.nextDouble()

    square1.setDimensions(length, height)
    square1.printDimensions()
    println("Square1 has an area of ${square1.getArea()}")
    println()
    /// End of Square Object ///

    /// Beginning of Circle Object ///
    val circle1 : Shape
    circle1 = Circle("Circle1")

    print("Enter the radius of the circle: ")
    var radius : Double = reader.nextDouble()

    circle1.setDimensions(radius)
    circle1.printDimensions()
    println("Circle1 has an area of ${circle1.getArea()}")
    println()
    /// End of Circle Object ///


}