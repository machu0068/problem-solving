import java.io.BufferedReader
import java.io.BufferedWriter

fun main() {
    val n = BufferedReader(System.`in`.reader()).use {
        it.readLine().toInt()
    }
    BufferedWriter(System.out.writer()).use {
        it.write(
            when (n) {
                in 3000..10000 -> "book"
                in 1000 until 3000 -> "mask"
                in 500 until 1000 -> "pen"
                else -> "no"
            }
        )
    }
}