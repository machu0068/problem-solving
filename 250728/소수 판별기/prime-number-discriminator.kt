import java.io.BufferedReader
import java.io.BufferedWriter

fun main() {
    val n = BufferedReader(System.`in`.reader()).use { it.readLine().toInt() }
    val output = when ((2 until n).firstOrNull { n % it == 0 } == null) {
        true -> "P"
        false -> "C"
    }
    BufferedWriter(System.out.writer()).use { it.write(output) }
}