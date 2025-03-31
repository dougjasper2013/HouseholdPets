class Cat(name: String, age: Int) : Animal(name, age) {
    override fun makeSound() {
        println("$name meows.")
    }

    fun scratch() {
        println("$name is scratching furniture!")
    }
}

