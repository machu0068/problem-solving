fun inputIntPair(): Pair<Int, Int> {
    val inputIntList = readln()
        .split(" ")
        .map { it.toInt() }
    return Pair(inputIntList[0], inputIntList[1])
}

fun main() {
    val numbers = inputIntPair()
    val compareXY = numbers.first.compareTo(numbers.second)
    when {
        compareXY > 0 -> println(">")
        compareXY < 0 -> println("<")
        else -> println("==")
    }
}