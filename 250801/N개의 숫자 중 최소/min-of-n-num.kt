import java.io.BufferedReader
import java.io.BufferedWriter
import java.util.StringTokenizer

fun main() {
    BufferedReader(System.`in`.reader()).use { br ->
        val n = br.readLine().trim().toInt()
        val array = StringTokenizer(br.readLine()).run {
            Array(n) { nextToken().toInt() }
        }
        val output = buildString {
            val min = array.minOrNull()
            val count = array.count { it == min }
            append("$min $count")
        }
        BufferedWriter(System.out.writer()).use { it.write(output) }
    }
}