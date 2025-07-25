import java.io.BufferedReader
import java.io.BufferedWriter
import java.util.StringTokenizer

fun main() {
    BufferedReader(System.`in`.reader()).use { br ->
        BufferedWriter(System.out.writer()).use { bw ->
            val st = StringTokenizer(br.readLine())
            val (yyyy, mm, dd) = Triple(
                st.nextToken(".").toInt(),
                st.nextToken(".").toInt(),
                st.nextToken(".").toInt()
            )
            val output = buildString {
                append(listOf(mm, dd, yyyy).joinToString("-"))
            }
            bw.write(output)
        }
    }
}