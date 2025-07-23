import java.io.BufferedReader
import java.io.BufferedWriter

fun main() {
    val n = BufferedReader(System.`in`.reader()).use {
        it.readLine().toInt()
    }
    BufferedWriter(System.out.writer()).use { bw ->
        repeat(n) { i ->
            repeat(n - i) {
                bw.write("* ")
            }
            bw.newLine()
        }
    }
}