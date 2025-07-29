import java.io.BufferedReader
import java.io.BufferedWriter

fun main() {
    val n = BufferedReader(System.`in`.reader()).use { it.readLine().toInt() }
    val output = Array(n) { row ->
        when {
            row == 0 -> Array(n) { "*" }.joinToString(" ")
            else -> Array(n) { col ->
                when {
                    col % 2 == 1 && col >= row -> "*"
                    else -> " "
                }
            }.joinToString(" ")
        }
    }.joinToString("\n")
    BufferedWriter(System.out.writer()).use { it.write(output) }
}