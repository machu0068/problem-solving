import java.io.BufferedReader
import java.io.BufferedWriter

fun main() {
    val n = BufferedReader(System.`in`.reader()).use { it.readLine().toInt() }
    val output = Array(n) { row ->
        Array(n) { col ->
            11 + (col * 2) + (row * 2)
        }.joinToString(" ")
    }.joinToString("\n")
    BufferedWriter(System.out.writer()).use { it.write(output) }
}