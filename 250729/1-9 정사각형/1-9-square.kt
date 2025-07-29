import java.io.BufferedReader
import java.io.BufferedWriter

fun main() {
    val n = BufferedReader(System.`in`.reader()).use { it.readLine().toInt() }
    val iterator = generateSequence(1) { if (it == 9) 1 else it + 1 }.iterator()
    val output = Array(n) {
        Array(n) {
            iterator.next()
        }.joinToString("")
    }.joinToString("\n")
    BufferedWriter(System.out.writer()).use { it.write(output) }
}