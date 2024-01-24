import kotlin.math.*
import java.util.Scanner

fun main() {
    val square1 : Shape
    square1 = Square("Square1")

    val reader = Scanner(System.`in`)

    print("Enter the length of the square: ")
    var length : Double = reader.nextDouble()
    print("Enter the height of the square: ")
    var height : Double = reader.nextDouble()

    square1.setDimensions(length, height)
    square1.printDimensions()
    println("Square1 has area of ${square1.getArea()}")


}