fun inputLongOneLine(): List<Long> = readln().split(" ").map { it.toLong() }

fun main() {
    val numbers = inputLongOneLine()
    println(numbers.sum())
}
