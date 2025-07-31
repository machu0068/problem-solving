import java.io.BufferedReader
import java.io.BufferedWriter
import java.util.StringTokenizer

fun main() {
    BufferedReader(System.`in`.reader()).use { br ->
        BufferedWriter(System.out.writer()).use { bw ->
            val st1 = StringTokenizer(br.readLine())
            val (n, m) = st1.nextToken().toInt() to st1.nextToken().toInt()
            val st2 = StringTokenizer(br.readLine())
            val output = Array(n) { st2.nextToken().toInt() }
                .count { it == m }
                .toString()
            bw.write(output)
        }
    }

}