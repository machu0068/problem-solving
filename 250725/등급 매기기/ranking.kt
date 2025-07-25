import java.io.BufferedReader
import java.io.BufferedWriter

fun main() {
    val n = BufferedReader(System.`in`.reader()).use {
        it.readLine().toInt()
    }
    BufferedWriter(System.out.writer()).use {
        it.write(
            when (n) {
                in 90..100 -> "A"
                in 80 until 90 -> "B"
                in 70 until 80 -> "C"
                in 60 until 70 -> "D"
                else -> "F"
            }
        )
    }
}