import java.io.BufferedReader
import java.io.BufferedWriter

fun main() {
    BufferedReader(System.`in`.reader()).use { br ->
        BufferedWriter(System.out.writer()).use { bw ->
            val (a, b, c) = Triple(
                br.readLine().toDouble(),
                br.readLine().toDouble(),
                br.readLine().toDouble()
            )
            val output = buildString {
                appendLine("%.3f".format(a))
                appendLine("%.3f".format(b))
                appendLine("%.3f".format(c))
            }
            bw.write(output)
        }
    }
}