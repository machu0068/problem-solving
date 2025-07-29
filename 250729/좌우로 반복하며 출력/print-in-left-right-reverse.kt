import java.io.BufferedReader
import java.io.BufferedWriter

fun main() {
    val n = BufferedReader(System.`in`.reader()).use { it.readLine().toInt() }
    val output = Array(n) { row ->
        when {
            row % 2 == 0 -> (1..n)
            else -> (1..n).reversed()
        }.joinToString("")
    }.joinToString("\n")
    BufferedWriter(System.out.writer()).use { it.write(output) }
}