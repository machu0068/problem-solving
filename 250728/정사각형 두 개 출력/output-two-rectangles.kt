import java.io.BufferedReader
import java.io.BufferedWriter

fun main() {
    val n = BufferedReader(System.`in`.reader()).use { it.readLine().toInt() }
    val output =
        Array(2) {
            Array(n) {
                Array(n) { "*" }.joinToString("")
            }.joinToString("\n")
        }.joinToString("\n\n")
    BufferedWriter(System.out.writer()).use { it.write(output) }
}