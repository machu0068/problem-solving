import java.io.BufferedReader
import java.io.BufferedWriter

fun main() {
    val br = BufferedReader(System.`in`.reader())
    val y = br.readLine().toInt()
    BufferedWriter(System.out.writer()).use {
        it.write(
            when {
                y % 100 == 0 && y % 400 != 0 -> "false"
                y % 4 == 0 -> "true"
                else -> "false"
            }
        )
    }
}