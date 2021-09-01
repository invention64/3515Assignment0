class Square(_name: String) : Shape(_name) {
    var length : Double = 0.0
    var height : Double = 0.0
    fun setDimensions(length : Double, height : Double) {
        this.length = length
        this.height = height
    }

    override fun printDimensions() {
        println("Length is $length and Height is $height")
    }

    override fun getArea(): Double {
        return length * height
    }
}