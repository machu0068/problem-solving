import java.io.BufferedReader
import java.io.BufferedWriter

fun main() {
    val (a, b) = BufferedReader(System.`in`.reader()).use {
        it.readLine().toDouble() to it.readLine().toDouble()
    }
    BufferedWriter(System.out.writer()).use {
        it.write(
            when {
                a >= 1.0 && b >= 1.0 -> "High"
                a >= 0.5 && b >= 0.5 -> "Middle"
                else -> "Low"
            }
        )
    }
}