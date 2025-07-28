import java.io.BufferedReader
import java.io.BufferedWriter

fun main() {
    val n = BufferedReader(System.`in`.reader()).use { it.readLine().toInt() }
    val output = (1..n).joinToString(" ") { num ->
        val digits = num.toString().map { digit -> digit.digitToInt() }
        when {
            num % 3 == 0 -> "0"
            digits.any { it % 3 == 0 && it != 0 } -> "0"
            else -> num.toString()
        }
    }
    BufferedWriter(System.out.writer()).use { it.write(output) }
}