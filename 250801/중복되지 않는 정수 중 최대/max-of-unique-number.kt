import java.io.BufferedReader
import java.io.BufferedWriter
import java.util.StringTokenizer

fun main() {
    BufferedReader(System.`in`.reader()).use { br ->
        val n = br.readLine().toInt()
        val result = StringTokenizer(br.readLine())
            .run { Array(n) { nextToken().toInt() } }
            .groupingBy { it }
            .eachCount()
            .filter { it.value == 1 }
            .keys
            .maxOrNull() ?: -1
        BufferedWriter(System.out.writer()).use { it.write(result.toString()) }
    }
}