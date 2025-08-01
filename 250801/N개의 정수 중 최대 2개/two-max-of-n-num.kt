import java.io.BufferedReader
import java.io.BufferedWriter
import java.util.StringTokenizer

fun main() {
    BufferedReader(System.`in`.reader()).use { br ->
        val n = br.readLine().trim().toInt()
        val array = StringTokenizer(br.readLine()).run {
            Array(n) { nextToken().toInt() }
        }.sortedArray().reversed()
        val output = buildString {
            append("${array[0]} ${array[1]}")
        }
        BufferedWriter(System.out.writer()).use { it.write(output) }
    }
}