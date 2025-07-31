import java.io.BufferedReader
import java.io.BufferedWriter
import java.util.StringTokenizer

fun main() {
    BufferedReader(System.`in`.reader()).use { br ->
        BufferedWriter(System.out.writer()).use { bw ->
            val n = br.readLine().toInt()
            val st = StringTokenizer(br.readLine())
            val map = Array(n) { st.nextToken().toInt() }
                .groupingBy { it }
                .eachCount()
            val output = Array(9) { map[it + 1] ?: 0 }.joinToString("\n")
            bw.write(output)
        }
    }
}