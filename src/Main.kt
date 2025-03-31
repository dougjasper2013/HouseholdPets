fun main() {
    val myCat = Cat("Garfield", 3)
    val myDog = Dog("Odie", 5)

    myCat.info()
    myCat.makeSound()
    myCat.scratch()

    println()

    myDog.info()
    myDog.makeSound()
    myDog.fetch()
}
