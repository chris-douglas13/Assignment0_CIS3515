import kotlin.math.*
import java.util.Scanner

fun main() {
    /// Beginning of Square Object ///
    val square1 : Shape
    square1 = Square("Square1")

    val reader = Scanner(System.`in`)

    print("Enter the length of the square: ")
    val length : Double = reader.nextDouble()
    print("Enter the height of the square: ")
    val height : Double = reader.nextDouble()

    square1.setDimensions(length, height)
    square1.printDimensions()
    println("Square1 has an area of ${square1.getArea()}")
    println()
    /// End of Square Object ///


    /// Beginning of Circle Object ///
    val circle1 : Shape
    circle1 = Circle("Circle1")

    print("Enter the radius of the circle: ")
    val radius : Double = reader.nextDouble()

    circle1.setDimensions(radius)
    circle1.printDimensions()
    println("Circle1 has an area of ${circle1.getArea()}")
    println()
    /// End of Circle Object ///


    /// Beginning of Triangle Object ///
    val triangle1 : Shape
    triangle1 = Triangle("Triangle1")

    print("Enter the length of the first side of the triangle: ")
    val side1 : Double = reader.nextDouble()
    print("Enter the length of the second side of the triangle: ")
    val side2 : Double = reader.nextDouble()
    print("Enter the length of the third side of the triangle: ")
    val side3 : Double = reader.nextDouble()

    triangle1.setDimensions(side1, side2, side3)
    triangle1.printDimensions()
    println("Triangle1 has an area of ${triangle1.getArea()}")
    println()
    /// End of Triangle Object ///


    /// Beginning of EquilateralTriangle Object ///
    val equilateralTriangle1 : Shape
    equilateralTriangle1 = EquilateralTriangle("EquilateralTriangle1")

    print("Enter the length of the sides of the equilateral triangle: ")
    val side : Double = reader.nextDouble()

    equilateralTriangle1.setDimensions(side)
    equilateralTriangle1.printDimensions()
    println("Triangle1 has an area of ${equilateralTriangle1.getArea()}")
    println()
    /// End of EquilateralTriangle Object ///

}