import java.io.BufferedReader
import java.io.BufferedWriter
import java.util.StringTokenizer

fun main() {
    BufferedReader(System.`in`.reader()).use { br ->
        val array = Array(2) {
            StringTokenizer(br.readLine()).run {
                Array(4) { nextToken().toInt() }
            }
        }
        val rowAverages = array.map { it.average() }
        val colAverages = (0..3).map { i -> (array[0][i] + array[1][i]) / 2.0 }
        val totalAverage = array.flatten().average()

        val output = buildString {
            appendLine(rowAverages.joinToString(" ") { "%.1f".format(it) })
            appendLine(colAverages.joinToString(" ") { "%.1f".format(it) })
            append("%.1f".format(totalAverage))
        }
        BufferedWriter(System.out.writer()).use { it.write(output) }
    }
}