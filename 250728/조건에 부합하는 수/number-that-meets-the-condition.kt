import java.io.BufferedReader
import java.io.BufferedWriter

fun main() {
    val a = BufferedReader(System.`in`.reader()).use { it.readLine().toInt() }
    val output = (1..a).filter {
        !(it % 2 == 0 && it % 4 != 0
                || (it / 8) % 2 == 0
                || (it % 7) < 4)
    }.joinToString(" ")
    BufferedWriter(System.out.writer()).use { it.write(output) }
}