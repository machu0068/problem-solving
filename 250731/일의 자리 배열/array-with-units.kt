import java.io.BufferedReader
import java.io.BufferedWriter
import java.util.StringTokenizer

fun main() {
    BufferedReader(System.`in`.reader()).use { br ->
        BufferedWriter(System.out.writer()).use { bw ->
            val st = StringTokenizer(br.readLine())
            val (first, second) = st.nextToken().toInt() to st.nextToken().toInt()
            val sequence = generateSequence(Pair(first, second)) { curr ->
                val next = curr.first + curr.second
                curr.second to next
            }
            val output = sequence
                .map { it.first % 10 }
                .take(10)
                .toList()
                .joinToString(" ")
            bw.write(output)
        }
    }
}