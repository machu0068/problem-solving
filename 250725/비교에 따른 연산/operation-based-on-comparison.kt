import java.io.BufferedReader
import java.io.BufferedWriter
import java.util.StringTokenizer

fun main() {
    BufferedReader(System.`in`.reader()).use { br ->
        BufferedWriter(System.out.writer()).use { bw ->
            val st = StringTokenizer(br.readLine())
            val a = st.nextToken().toInt()
            val b = st.nextToken().toInt()
            val output = buildString {
                append(
                    if (a > b) a * b else b / a
                )
            }
            bw.write(output)
        }
    }
}