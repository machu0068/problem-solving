import java.io.BufferedReader
import java.io.BufferedWriter

fun main() {
    val c = BufferedReader(System.`in`.reader()).use {
        it.readLine()
    }
    BufferedWriter(System.out.writer()).use {
        it.write(
            when (c) {
                "S" -> "Superior"
                "A" -> "Excellent"
                "B" -> "Good"
                "C" -> "Usually"
                "D" -> "Effort"
                else -> "Failure"
            }
        )
    }
}