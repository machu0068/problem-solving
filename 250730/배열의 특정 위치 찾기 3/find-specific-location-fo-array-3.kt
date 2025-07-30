import java.io.BufferedReader
import java.io.BufferedWriter
import java.util.StringTokenizer

fun main() {
    BufferedReader(System.`in`.reader()).use { br ->
        BufferedWriter(System.out.writer()).use { bw ->
            val st = StringTokenizer(br.readLine())
            val output = generateSequence { st.nextToken().toInt() }
                .takeWhile { it != 0 }
                .toList()
                .takeLast(3)
                .reversed()
                .sum()
                .toString()
            bw.write(output)
        }
    }
}