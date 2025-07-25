import java.io.BufferedReader
import java.io.BufferedWriter
import java.util.StringTokenizer

fun main() {
    BufferedReader(System.`in`.reader()).use { br ->
        BufferedWriter(System.out.writer()).use { bw ->
            val st = StringTokenizer(br.readLine())
            val (mm, dd, yyyy) = Triple(
                st.nextToken("-").toInt(),
                st.nextToken("-").toInt(),
                st.nextToken().toInt()
            )
            val output = buildString {
                append(listOf(yyyy, mm, dd).joinToString("."))
            }
            bw.write(output)
        }
    }
}