import java.io.BufferedReader
import java.io.BufferedWriter

fun main() {
    BufferedReader(System.`in`.reader()).use { br ->
        BufferedWriter(System.out.writer()).use { bw ->
            val ft = 30.48
            val n = br.readLine().toDouble()
            val output = buildString {
                append("%.1f".format(n * ft))
            }
            bw.write(output)
        }
    }
}