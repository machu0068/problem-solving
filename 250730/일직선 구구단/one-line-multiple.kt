import java.io.BufferedReader
import java.io.BufferedWriter

fun main() {
    val n = BufferedReader(System.`in`.reader()).use { it.readLine().toInt() }
    val output = (1..n).joinToString("\n") { dan ->
        (1..n).joinToString("\n") { i ->
            "$dan * $i = ${dan * i}"
        }
    }
    BufferedWriter(System.out.writer()).use { it.write(output) }
}