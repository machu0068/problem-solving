import java.io.BufferedReader
import java.io.BufferedWriter
import java.util.StringTokenizer

fun main() {
    BufferedReader(System.`in`.reader()).use { br ->
        BufferedWriter(System.out.writer()).use { bw ->
            val st = StringTokenizer(br.readLine())
            val (first, second, third) = Triple(
                st.nextToken("-"),
                st.nextToken("-"),
                st.nextToken()
            )
            val output = buildString {
                append(listOf(first, third, second).joinToString("-"))
            }
            bw.write(output)
        }
    }
}