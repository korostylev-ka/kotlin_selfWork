fun main() {
    var a = 10
    a += 5
    println("Котлин $a")
    val animal = Cat("Bars", 9)
    println(animal)
    var massiv = emptyArray<Int>()
    for (i in 0..10){
        massiv += i

    }
    println(massiv.contentToString())
    arrayChet(massiv)
    println(arrayMaxValue(massiv))
}
fun arrayChet(massiv: Array<Int>) {
    for (value in massiv) {
        if (value % 2 == 0) println(value)
    }
}
fun arrayMaxValue(massiv: Array<Int>): String {
    var max = 0
    for (value in massiv) {
        if (value > max) max = value
    }
    return "Максимальный элемент массива имеет значение $max"
}

open class Animal(
    val name: String,
    val age: Int
) {
    override fun toString(): String {
        return ("Животное $name возрастом $age")
    }
}

class Cat(
    name: String,
    age: Int
): Animal(name, age) {
    override fun toString(): String {
        return ("кот $name возрастом $age")
    }
}
