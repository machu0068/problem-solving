import java.io.BufferedReader
import java.io.BufferedWriter

fun main() {
    val n = BufferedReader(System.`in`.reader()).use {
        it.readLine().toInt()
    }
    BufferedWriter(System.out.writer()).use { bw ->
        bw.write(
            (1..n).joinToString("\n") { i ->
                (1..n).joinToString(", ") { j ->
                    "$i * $j = ${i * j}"
                }
            }
        )
    }
}