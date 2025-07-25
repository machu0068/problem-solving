import java.io.BufferedReader
import java.io.BufferedWriter

fun main() {
    val n = BufferedReader(System.`in`.reader()).use {
        it.readLine().toInt()
    }
    BufferedWriter(System.out.writer()).use {
        it.write(
            when (n) {
                2 -> "28"
                4, 6, 9, 11 -> "30"
                else -> "31"
            }
        )
    }
}