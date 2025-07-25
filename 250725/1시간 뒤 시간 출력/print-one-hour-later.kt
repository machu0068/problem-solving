import java.io.BufferedReader
import java.io.BufferedWriter
import java.util.StringTokenizer

fun main() {
    BufferedReader(System.`in`.reader()).use { br ->
        BufferedWriter(System.out.writer()).use { bw ->
            val st = StringTokenizer(br.readLine())
            val (h, m) = Pair(
                st.nextToken(":").toInt(),
                st.nextToken().toInt()
            )
            val output = buildString {
                append("${h + 1}:$m")
            }
            bw.write(output)
        }
    }
}