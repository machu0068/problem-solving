import java.io.BufferedReader
import java.io.BufferedWriter
import java.util.StringTokenizer

fun main() {
    val (a, b, c) = BufferedReader(System.`in`.reader()).use { br ->
        StringTokenizer(br.readLine()).run {
            Triple(
                nextToken().toInt(),
                nextToken().toInt(),
                nextToken().toInt()
            )
        }
    }
    val output = listOf(
        when {
            a <= b && a <= c -> "1"
            else -> "0"
        },
        when {
            a == b && b == c -> "1"
            else -> "0"
        }
    ).joinToString(" ")
    BufferedWriter(System.out.writer()).use { it.write(output) }
}