import java.io.BufferedReader
import java.io.BufferedWriter

fun main() {
    val n = BufferedReader(System.`in`.reader()).use { it.readLine().toInt() }
    val list = (1..n).toList()
    val output = Array(n) { row ->
        Array(n) { col ->
            when {
                col % 2 == 0 -> list[row]
                else -> list[n - row - 1]
            }
        }.joinToString("")
    }.joinToString("\n")
    BufferedWriter(System.out.writer()).use { it.write(output) }
}