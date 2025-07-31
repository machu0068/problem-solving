import java.io.BufferedReader
import java.io.BufferedWriter
import java.util.StringTokenizer

fun main() {
    BufferedReader(System.`in`.reader()).use { br ->
        BufferedWriter(System.out.writer()).use { bw ->
            val n = br.readLine().toInt()
            val st = StringTokenizer(br.readLine())
            val output = Array(n) { st.nextToken().toInt() }
                .filter { it % 2 == 0 }
                .joinToString(" ")
            bw.write(output)
        }
    }
}