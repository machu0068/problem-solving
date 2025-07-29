import java.io.BufferedReader
import java.io.BufferedWriter

fun main() {
    val n = BufferedReader(System.`in`.reader()).use { it.readLine().toInt() }
    val output = Array(n) { row ->
        Array(n) { col ->
            when {
                row == 0 || row == n - 1 || col == 0 || col == n - 1 || row > col -> "*"
                else -> " "
            }
        }.joinToString(" ")
    }.joinToString("\n")
    BufferedWriter(System.out.writer()).use { it.write(output) }
}