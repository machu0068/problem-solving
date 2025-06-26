fun inputIntOneLine(): List<Int> = readln().split(" ").map { it.toInt() }

fun main() {
    val numbers = inputIntOneLine()
    val (a, b, c) = Triple(numbers[0], numbers[1], numbers[2])

    println("${(a + b) % c}")
    println("${((a % c) + (b % c)) % c}")
    println("${(a * b) % c}")
    println("${((a % c) * (b % c)) % c}")
}
