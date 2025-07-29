import java.io.BufferedReader
import java.io.BufferedWriter

fun main() {
    val n = BufferedReader(System.`in`.reader()).use { it.readLine().toInt() }
    val output = Array(n) { row ->
        Array(n) { col ->
            listOf(n - row, n - col).joinToString(",", "(", ")")
        }.joinToString(" ")
    }.joinToString("\n")
    BufferedWriter(System.out.writer()).use { it.write(output) }
}