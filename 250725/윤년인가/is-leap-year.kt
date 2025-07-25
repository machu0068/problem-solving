import java.io.BufferedReader
import java.io.BufferedWriter

fun main() {
    val y = BufferedReader(System.`in`.reader()).use {
        it.readLine().toInt()
    }
    BufferedWriter(System.out.writer()).use {
        it.write(
            when {
                y % 4 == 0 && !(y % 100 == 0 && y % 400 != 0) -> "true"
                else -> "false"
            }
        )
    }
}