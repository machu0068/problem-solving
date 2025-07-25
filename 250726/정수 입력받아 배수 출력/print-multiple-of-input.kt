import java.io.BufferedReader
import java.io.BufferedWriter

fun main() {
    val n = BufferedReader(System.`in`.reader()).use {
        it.readLine().toInt()
    }
    val output = (n..5 * n step n).joinToString(" ")
    BufferedWriter(System.out.writer()).use { it.write(output) }
}