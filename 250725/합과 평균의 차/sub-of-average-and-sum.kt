import java.io.BufferedReader
import java.io.BufferedWriter
import java.util.StringTokenizer

fun main() {
    BufferedReader(System.`in`.reader()).use { br ->
        BufferedWriter(System.out.writer()).use { bw ->
            val st = StringTokenizer(br.readLine())
            val a = st.nextToken().toInt()
            val b = st.nextToken().toInt()
            val c = st.nextToken().toInt()
            val sum = a + b + c
            val avg = sum / 3
            val output = buildString {
                appendLine(sum)
                appendLine(avg)
                appendLine(sum - avg)
            }
            bw.write(output)
        }
    }
}