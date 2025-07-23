import java.io.BufferedReader
import java.io.BufferedWriter

fun main() {
    val br = BufferedReader(System.`in`.reader())
    val n = br.readLine().toInt()
    BufferedWriter(System.out.writer()).use {
        it.write(
            when {
                n % 2 == 1 && n % 3 == 0 -> "true"
                n % 2 == 0 && n % 5 == 0 -> "true"
                else -> "false"
            }
        )
    }
}