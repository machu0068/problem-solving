import java.io.BufferedReader
import java.io.BufferedWriter
import java.util.StringTokenizer

fun main() {
    BufferedReader(System.`in`.reader()).use { br ->
        BufferedWriter(System.out.writer()).use { bw ->
            val st = StringTokenizer(br.readLine())
            val output = buildString {
                append(st.nextToken("-"))
                append(st.nextToken())
            }
            bw.write(output)
        }
    }
}