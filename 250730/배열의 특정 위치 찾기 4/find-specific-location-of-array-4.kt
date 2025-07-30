fun main() {
    val result = readln().split(' ')
        .asSequence()
        .map { it.toInt() }
        .take(10)
        .takeWhile { it != 0 }
        .filter { it % 2 == 0 }
        .toList()

    println("${result.size} ${result.sum()}")
}