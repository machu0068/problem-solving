import java.io.BufferedReader
import java.io.BufferedWriter
import java.util.StringTokenizer

fun main() {
    BufferedReader(System.`in`.reader()).use { br ->
        BufferedWriter(System.out.writer()).use { bw ->
            val st = StringTokenizer(br.readLine())
            generateSequence { st.nextToken().toInt() }
                .takeWhile { it % 3 != 0 }
                .last()
                .let { bw.write(it.toString()) }
        }
    }
}