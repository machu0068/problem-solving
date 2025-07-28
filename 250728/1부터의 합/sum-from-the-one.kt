import java.io.BufferedReader
import java.io.BufferedWriter

fun main() {
    val n = BufferedReader(System.`in`.reader()).use { it.readLine().toInt() }
    generateSequence(1 to 0) { (i, acc) -> i + 1 to acc + i }
        .first { (i, acc) -> acc + i >= n }
        .let { (i, _) ->
            BufferedWriter(System.out.writer()).use {
                it.write(i.toString())
            }
        }
}