import java.io.BufferedReader
import java.io.BufferedWriter
import java.util.StringTokenizer

fun main() {
    BufferedReader(System.`in`.reader()).use { br ->
        val n = br.readLine().toInt()
        val st = StringTokenizer(br.readLine())
        val average = Array(n) { st.nextToken().toDouble() }.average()
        val output = buildString {
            appendLine("%.1f".format(average))
            appendLine(
                when {
                    average >= 4.0 -> "Perfect"
                    average >= 3.0 -> "Good"
                    else -> "Poor"
                }
            )
        }
        BufferedWriter(System.out.writer()).use { it.write(output) }
    }
}