import java.io.BufferedReader
import java.io.BufferedWriter
import java.util.StringTokenizer

fun main() {
    BufferedReader(System.`in`.reader()).use { br ->
        BufferedWriter(System.out.writer()).use { bw ->
            val st = StringTokenizer(br.readLine())
            val output = Array(10) { st.nextToken().first() }
                .let { listOf(it[1], it[4], it[7]) }
                .joinToString(" ")
            bw.write(output)
        }
    }
}