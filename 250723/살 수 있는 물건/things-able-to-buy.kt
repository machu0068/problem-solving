import java.io.BufferedReader
import java.io.BufferedWriter

fun main() {
    val br = BufferedReader(System.`in`.reader())
    val n = br.readLine().toInt()
    BufferedWriter(System.out.writer()).use {
        it.write(
            when (n) {
                in (3000..10000) -> "book"
                in (1000 until 3000) -> "mask"
                else -> "no"
            }
        )
    }
}