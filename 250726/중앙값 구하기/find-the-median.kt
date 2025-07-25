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
    val median = when {
        b < c -> when {
            a < b -> b
            c < a -> c
            else -> a
        }

        else -> when {
            a < c -> c
            b < a -> b
            else -> a
        }
    }
    BufferedWriter(System.out.writer()).use { it.write(median.toString()) }
}