import java.io.BufferedReader
import java.io.BufferedWriter

fun main() {
    val n = BufferedReader(System.`in`.reader()).use { it.readLine().toInt() }
    generateSequence(1 to 1) { (i, prod) -> i + 1 to prod * i }
        .first { (i, prod) -> prod * i >= n }
        .let { (i, _) ->
            BufferedWriter(System.out.writer()).use {
                it.write(i.toString())
            }
        }
}