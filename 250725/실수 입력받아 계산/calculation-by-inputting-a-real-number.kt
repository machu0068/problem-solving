import java.io.BufferedReader
import java.io.BufferedWriter

fun main() {
    BufferedReader(System.`in`.reader()).use { br ->
        BufferedWriter(System.out.writer()).use { bw ->
            val (a, b) = Pair(
                br.readLine().toDouble(),
                br.readLine().toDouble()
            )
            val output = buildString {
                append("%.2f".format(a + b))
            }
            bw.write(output)
        }
    }
}