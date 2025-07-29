import java.io.BufferedReader
import java.io.BufferedWriter

fun main() {
    val n = BufferedReader(System.`in`.reader()).use { it.readLine().toInt() }
    val iterator = generateSequence(1) { it + 1 }.iterator()
    val output = Array(n) { row ->
        val array = Array(n) { iterator.next() }
        if (row % 2 == 0) array else array.reversedArray()
    }.joinToString("\n") { it.joinToString(" ") }
    BufferedWriter(System.out.writer()).use { it.write(output) }
}