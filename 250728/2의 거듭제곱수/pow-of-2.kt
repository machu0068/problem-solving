import java.io.BufferedReader
import java.io.BufferedWriter

fun main() {
    val n = BufferedReader(System.`in`.reader()).use { it.readLine().toInt() }
    val output = generateSequence(n) { it / 2 }
        .takeWhile { it != 1 }
        .count()
        .toString()
    BufferedWriter(System.out.writer()).use { it.write(output) }
}