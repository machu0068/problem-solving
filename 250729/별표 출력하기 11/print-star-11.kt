import java.io.BufferedReader
import java.io.BufferedWriter

fun main() {
    val n = BufferedReader(System.`in`.reader()).use { it.readLine().toInt() }
    val output = Array(2 * n + 1) { i ->
        when {
            i % 2 == 0 -> Array(2 * n + 1) { "*" }
            else -> Array(2 * n + 1) { j ->
                when {
                    j % 2 == 0 -> "*"
                    else -> " "
                }
            }
        }.joinToString(" ")
    }.joinToString("\n")
    BufferedWriter(System.out.writer()).use { it.write(output) }
}