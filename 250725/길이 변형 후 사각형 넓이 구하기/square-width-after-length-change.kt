import java.io.BufferedReader
import java.io.BufferedWriter
import java.util.StringTokenizer

fun main() {
    BufferedReader(System.`in`.reader()).use { br ->
        BufferedWriter(System.out.writer()).use { bw ->
            val st = StringTokenizer(br.readLine())
            var (width, height) = Pair(
                st.nextToken().toInt(),
                st.nextToken().toInt()
            )
            width += 8
            height *= 3
            val output = buildString {
                appendLine(width)
                appendLine(height)
                appendLine(width * height)
            }
            bw.write(output)
        }
    }
}