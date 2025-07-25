import java.io.BufferedReader
import java.io.BufferedWriter

fun main() {
    val a = BufferedReader(System.`in`.reader()).use {
        it.readLine().toInt()
    }
    val output = listOf(
        when (a % 3 == 0) {
            true -> "YES"
            else -> "NO"
        },
        when (a % 5 == 0) {
            true -> "YES"
            false -> "NO"
        }
    ).joinToString("\n")
    BufferedWriter(System.out.writer()).use { it.write(output) }
}