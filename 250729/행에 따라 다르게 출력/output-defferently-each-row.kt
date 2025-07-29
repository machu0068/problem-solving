import java.io.BufferedReader
import java.io.BufferedWriter

fun main() {
    val n = BufferedReader(System.`in`.reader()).use { it.readLine().toInt() }
    val iterator = run {
        var step = 1
        var count = 0
        generateSequence(1) {
            count++
            if (count == n) {
                count = 0
                step = if (step == 1) 2 else 1
            }
            it + step
        }.iterator()
    }
    val output = Array(n) {
        Array(n) { iterator.next() }.joinToString(" ")
    }.joinToString("\n")
    BufferedWriter(System.out.writer()).use { it.write(output) }
}