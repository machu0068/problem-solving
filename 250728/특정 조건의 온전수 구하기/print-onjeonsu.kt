import java.io.BufferedReader
import java.io.BufferedWriter

fun main() {
    val n = BufferedReader(System.`in`.reader()).use { it.readLine().toInt() }
    val output = (1..n)
        .filter { it % 2 != 0 && it % 10 != 5 && !(it % 3 == 0 && it % 9 != 0) }
        .joinToString(" ")
    BufferedWriter(System.out.writer()).use { it.write(output) }
}