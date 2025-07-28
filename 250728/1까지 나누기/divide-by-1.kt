import java.io.BufferedReader
import java.io.BufferedWriter

fun main() {
    val n = BufferedReader(System.`in`.reader()).use { it.readLine().toInt() }
    generateSequence(1 to n) { (i, q) -> i + 1 to q / i }
        .first { (i, q) -> q / i <= 1 }
        .let { (i, _) ->
            BufferedWriter(System.out.writer()).use {
                it.write(i.toString())
            }
        }
}