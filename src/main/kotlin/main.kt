fun main(args: Array<String>) {
    var square : Shape = Square("Square")
    var circle : Shape = Circle("Circle")
    var triangle : Shape = Triangle("Triangle")
    var equilateralTriangle : Shape = EquilateralTriangle("EqTriangle")

    // get the dimensions
    square as Square
    square.setDimensions(prompt("Square Height: "), prompt("Square Width: "))

    circle as Circle
    circle.setDimensions(prompt("Circle Radius: "))

    triangle as Triangle
    triangle.setDimensions(prompt("Triangle side A: "), prompt("Triangle side B: "), prompt("Triangle side C: "))

    equilateralTriangle as EquilateralTriangle
    equilateralTriangle.setDimensions(prompt("Equilateral Triangle Side Length: "))

    println()
    println("Displaying Shape information")
    square.printInfo()
    circle.printInfo()
    triangle.printInfo()
    equilateralTriangle.printInfo()
}

// prompt the user for input and return said input
fun prompt (msg : String) : Double {
    print(msg)
    val input = readLine()!!
    return input.toDouble()
}