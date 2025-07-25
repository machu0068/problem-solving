import java.io.BufferedReader
import java.io.BufferedWriter

fun main() {
    val m = BufferedReader(System.`in`.reader()).use {
        it.readLine().toInt()
    }
    BufferedWriter(System.out.writer()).use {
        it.write(
            when (m) {
                in 3..5 -> "Spring"
                in 6..8 -> "Summer"
                in 9..11 -> "Fall"
                else -> "Winter"
            }
        )
    }
}