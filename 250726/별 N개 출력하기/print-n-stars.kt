import java.io.BufferedReader
import java.io.BufferedWriter

fun main() {
    var n = BufferedReader(System.`in`.reader()).use {
        it.readLine().toInt()
    }
    val output = buildString {
        while (n > 0) {
            n--
            appendLine("*")
        }
    }
    BufferedWriter(System.out.writer()).use { it.write(output) }
}