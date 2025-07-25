import java.io.BufferedReader
import java.io.BufferedWriter

fun main() {
    val score = BufferedReader(System.`in`.reader()).use {
        it.readLine().toInt()
    }
    val result = if (score == 100) "pass" else "failure"
    BufferedWriter(System.out.writer()).use {
        it.write(result)
    }
}