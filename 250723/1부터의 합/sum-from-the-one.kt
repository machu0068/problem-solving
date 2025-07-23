import java.io.BufferedReader
import java.io.BufferedWriter

fun main() {
    val n = BufferedReader(System.`in`.reader()).use {
        it.readLine().toInt()
    }
    val num = (1..n)
        .runningFold(0) { acc, value -> acc + value }
        .drop(1)
        .indexOfFirst { acc -> n <= acc }
        .let { it + 1 }
    BufferedWriter(System.out.writer()).use {
        it.write(num.toString())
    }
}