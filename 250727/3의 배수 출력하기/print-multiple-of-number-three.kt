import java.io.BufferedReader
import java.io.BufferedWriter

fun main() {
    val n = BufferedReader(System.`in`.reader()).use {
        it.readLine().toInt()
    }
    val iterator = (1..n).filter { it % 3 == 0 }.iterator()
    val output = buildString {
        while (iterator.hasNext()) {
            append(iterator.next())
            append(" ")
        }
    }
    BufferedWriter(System.out.writer()).use { it.write(output) }
}