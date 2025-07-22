import java.io.BufferedReader
import java.io.BufferedWriter

fun main() {
    val br = BufferedReader(System.`in`.reader())
    val n = br.readLine().toDouble()
    BufferedWriter(System.out.writer()).use {
        it.write(String.format("%.2f", n))
    }
}