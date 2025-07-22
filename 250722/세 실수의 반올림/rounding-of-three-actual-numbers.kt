import java.io.BufferedReader
import java.io.BufferedWriter

fun main() {
    val br = BufferedReader(System.`in`.reader())
    val (a, b, c) = Triple(
        br.readLine().toDouble(),
        br.readLine().toDouble(),
        br.readLine().toDouble()
    )
    BufferedWriter(System.out.writer()).use {
        it.write(String.format("%.3f", a))
        it.newLine()
        it.write(String.format("%.3f", b))
        it.newLine()
        it.write(String.format("%.3f", c))
    }
}