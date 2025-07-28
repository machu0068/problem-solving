import java.io.BufferedReader
import java.io.BufferedWriter

fun main() {
    BufferedReader(System.`in`.reader()).use { br ->
        val n = br.readLine().toInt()
        val array = Array(n) { br.readLine().trim().toInt() }
        val output = buildString {
            append(array.sum())
            append(" ")
            append("%.1f".format(array.average()))
        }
        BufferedWriter(System.out.writer()).use { it.write(output) }
    }
}