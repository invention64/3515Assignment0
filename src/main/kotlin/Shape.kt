open class Shape (_name: String){
    var name = _name

    open fun getArea(): Double {
        return 0.0
    }

    open fun printDimensions() {
        println("No Dimensions");
    }

    open fun setDimensions() {

    }

    fun printInfo() {
        println("Shape $name has an area of ${getArea()} and the following dimensions:")
        printDimensions()
        println()
    }
}