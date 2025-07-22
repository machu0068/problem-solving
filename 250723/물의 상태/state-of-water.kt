import java.io.BufferedReader
import java.io.BufferedWriter

fun main() {
    val br = BufferedReader(System.`in`.reader())
    val n = br.readLine().toInt()
    BufferedWriter(System.out.writer()).use {
        it.write(
            when {
                n < 0 -> "ice"
                100 <= n -> "vapor"
                else -> "water"
            }
        )
    }
}