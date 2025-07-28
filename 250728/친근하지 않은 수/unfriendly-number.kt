import java.io.BufferedReader
import java.io.BufferedWriter

fun main() {
    val n = BufferedReader(System.`in`.reader()).use { it.readLine().toInt() }
    val output = (1..n).filter { it % 2 != 0 && it % 3 != 0 && it % 5 != 0 }.size.toString()
    BufferedWriter(System.out.writer()).use { it.write(output) }
}