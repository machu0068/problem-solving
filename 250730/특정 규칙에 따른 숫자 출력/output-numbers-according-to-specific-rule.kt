import java.io.BufferedReader
import java.io.BufferedWriter

fun main() {
    val n = BufferedReader(System.`in`.reader()).use { it.readLine().toInt() }
    val iterator = generateSequence(1) { if (it == 9) 1 else it + 1 }.iterator()
    val output = (0 until n).joinToString("\n") { i ->
        "  ".repeat(i) +
                (1..n - i).joinToString(" ") { iterator.next().toString() }
    }
    BufferedWriter(System.out.writer()).use { it.write(output) }
}