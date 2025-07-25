import java.io.BufferedReader
import java.io.BufferedWriter

fun main() {
    val n = BufferedReader(System.`in`.reader()).use {
        it.readLine().toInt()
    }
    val iterator = (1..n).iterator()
    val output = buildString {
        while (iterator.hasNext()) {
            append(iterator.nextInt())
            append(" ")
        }
    }
    BufferedWriter(System.out.writer()).use { it.write(output) }
}