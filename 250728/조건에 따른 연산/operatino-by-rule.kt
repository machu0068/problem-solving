import java.io.BufferedReader
import java.io.BufferedWriter

fun main() {
    val n = BufferedReader(System.`in`.reader()).use { it.readLine().toInt() }
    val output = generateSequence(n) { if (it % 2 == 0) it * 3 + 1 else it * 2 + 2 }
        .takeWhile { it < 1000 }
        .count()
        .toString()
    BufferedWriter(System.out.writer()).use { it.write(output) }
}