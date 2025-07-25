import java.io.BufferedReader
import java.io.BufferedWriter

fun main() {
    val n = BufferedReader(System.`in`.reader()).use { br ->
        br.readLine().toInt()
    }
    val output = (1..n).joinToString(" ")
    BufferedWriter(System.out.writer()).use { it.write(output) }
}