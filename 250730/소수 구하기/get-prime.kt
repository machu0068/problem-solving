import java.io.BufferedReader
import java.io.BufferedWriter

fun main() {
    val n = BufferedReader(System.`in`.reader()).use { it.readLine().toInt() }
    val output = (1..n).filter { num ->
        (1 until num).count { num % it == 0 } == 1
    }.joinToString(" ")
    BufferedWriter(System.out.writer()).use { it.write(output) }
}