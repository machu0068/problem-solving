import java.io.BufferedReader
import java.io.BufferedWriter

fun main() {
    val n = BufferedReader(System.`in`.reader()).use { it.readLine().toInt() }
    val isPerfect = (1 until n).filter { i -> n % i == 0 }.sum() == n
    val output = when (isPerfect) {
        true -> "P"
        false -> "N"
    }
    BufferedWriter(System.out.writer()).use { it.write(output) }
}