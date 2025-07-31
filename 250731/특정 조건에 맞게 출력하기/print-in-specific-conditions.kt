import java.io.BufferedReader
import java.io.BufferedWriter
import java.util.StringTokenizer

fun main() {
    BufferedReader(System.`in`.reader()).use { br ->
        BufferedWriter(System.out.writer()).use { bw ->
            val st = StringTokenizer(br.readLine())
            val output = generateSequence { st.nextToken().toInt() }
                .takeWhile { it != 0 }
                .map { if (it % 2 == 1) it + 3 else it / 2 }
                .joinToString(" ")
            bw.write(output)
        }
    }
}