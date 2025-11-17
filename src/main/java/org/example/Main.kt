package org.example

fun main() {
    println("Welcome to the HouseholdPets Application")

    val myCat = Cat("Garfield", 8)

    myCat.info()
    myCat.makeSound()
    myCat.scratch()

    println()

    val myDog = Dog("Odie", 5)

    myDog.info()
    myDog.makeSound()
    myDog.fetch()
}