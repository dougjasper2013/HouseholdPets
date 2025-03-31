open class Animal(val name: String, val age: Int) {
    open fun makeSound() {
        println("$name makes a sound.")
    }

    fun info() {
        println("$name is $age years old.")
    }
}
