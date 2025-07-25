import java.io.BufferedReader
import java.io.BufferedWriter

fun main() {
    val n = BufferedReader(System.`in`.reader()).use {
        it.readLine().toInt()
    }
    BufferedWriter(System.out.writer()).use {
        it.write(
            when {
                n % 2 == 1 && n % 3 == 0 || n % 2 == 0 && n % 5 == 0 -> "true"
                else -> "false"
            }
        )
    }
}