import java.io.BufferedReader
import java.io.BufferedWriter
import java.util.StringTokenizer

fun main() {
    val (mid, final) = BufferedReader(System.`in`.reader()).use {
        StringTokenizer(it.readLine()).run {
            nextToken().toInt() to nextToken().toInt()
        }
    }
    BufferedWriter(System.out.writer()).use {
        it.write(
            when {
                mid >= 90 -> {
                    when (final) {
                        in 95..100 -> "100000"
                        in 90 until 95 -> "50000"
                        else -> "0"
                    }
                }

                else -> "0"
            }
        )
    }
}