import java.io.BufferedReader
import java.io.BufferedWriter

fun main() {
    BufferedReader(System.`in`.reader()).use { br ->
        BufferedWriter(System.out.writer()).use { bw ->
            val n = br.readLine().toDouble()
            val output = buildString {
                append("%.2f".format(n))
            }
            bw.write(output)
        }
    }
}