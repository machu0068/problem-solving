import java.io.BufferedReader
import java.io.BufferedWriter
import java.util.StringTokenizer
import kotlin.math.pow

fun main() {
    BufferedReader(System.`in`.reader()).use { br ->
        BufferedWriter(System.out.writer()).use { bw ->
            val st = StringTokenizer(br.readLine())
            val h = st.nextToken().toInt()
            val w = st.nextToken().toInt()
            val b = w / (h / 100.0).pow(2)
            val output = buildString {
                appendLine(b.toInt())
                if (b >= 25) {
                    append("Obesity")
                }
            }
            bw.write(output)
        }
    }
}