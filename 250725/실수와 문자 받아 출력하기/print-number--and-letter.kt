import java.io.BufferedReader
import java.io.BufferedWriter

fun main() {
    BufferedReader(System.`in`.reader()).use { br ->
        BufferedWriter(System.out.writer()).use { bw ->
            val (c, a, b) = Triple(
                br.readLine(),
                br.readLine().toDouble(),
                br.readLine().toDouble()
            )
            val output = buildString {
                appendLine(c)
                appendLine("%.2f".format(a))
                appendLine("%.2f".format(b))
            }
            bw.write(output)
        }
    }
}