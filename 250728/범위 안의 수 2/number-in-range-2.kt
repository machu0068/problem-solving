import java.io.BufferedReader
import java.io.BufferedWriter

fun main() {
    val array = BufferedReader(System.`in`.reader()).use { br ->
        Array(10) { br.readLine().toInt() }.filter { it >= 0 && it <= 200 }
    }
    val output = buildString {
        append(array.sum())
        append(" ")
        append("%.1f".format(array.average()))
    }
    BufferedWriter(System.out.writer()).use { it.write(output) }
}