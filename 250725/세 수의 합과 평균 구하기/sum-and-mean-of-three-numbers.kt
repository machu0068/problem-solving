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
            val output = buildString {
                appendLine(a + b + c)
                append((a + b + c) / 3)
            }
            bw.write(output)
        }
    }
}