import java.io.BufferedReader
import java.io.BufferedWriter

fun main() {
    val n = BufferedReader(System.`in`.reader()).use {
        it.readLine().toInt()
    }
    val count = (1..n).count {
        it % 2 != 0 && it % 3 != 0 && it % 5 != 0
    }
    BufferedWriter(System.out.writer()).use {
        it.write(count.toString())
    }
}