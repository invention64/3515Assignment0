import kotlin.math.sqrt

open class Triangle (_name: String) : Shape(_name) {
    var a : Double = 0.0
    var b : Double = 0.0
    var c : Double = 0.0
    fun setDimensions(a : Double, b : Double, c : Double) {
        this.a = a
        this.b = b
        this.c = c
    }
    override fun printDimensions() {
        println("Side A: $a Side B: $b Side C: $c")
    }

    override fun getArea() : Double {
        // s is one half the perimeter
        var s = (a+b+c)/2
        return sqrt(s*(s-a)*(s-b)*(s-c))
    }
}