import java.io.BufferedReader
import java.io.BufferedWriter
import java.util.StringTokenizer

fun main() {
    BufferedReader(System.`in`.reader()).use { br ->
        BufferedWriter(System.out.writer()).use { bw ->
            val st = StringTokenizer(br.readLine())
            var a = st.nextToken().toInt()
            var b = st.nextToken().toInt()
            a += b
            b += a
            val output = buildString {
                append("$a $b")
            }
            bw.write(output)
        }
    }
}