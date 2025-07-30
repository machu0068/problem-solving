import java.io.BufferedReader
import java.io.BufferedWriter

fun main() {
    val n = BufferedReader(System.`in`.reader()).use { it.readLine().toInt() }
    val chars = generateSequence('A') { it + 1 }.take(n * n)
    val output = chars.chunked(n).joinToString("\n") { it.joinToString("") }
    BufferedWriter(System.out.writer()).use { it.write(output) }
}