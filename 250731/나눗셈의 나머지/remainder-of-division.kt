import java.io.BufferedReader
import java.io.BufferedWriter
import java.util.StringTokenizer

fun main() {
    val (a, b) = BufferedReader(System.`in`.reader()).use { br ->
        val st = StringTokenizer(br.readLine())
        st.nextToken().toInt() to st.nextToken().toInt()
    }
    val map = generateSequence(a / b to a % b) { it.first / b to it.first % b }
        .takeWhile { !(it.first == 0 && it.second <= 1) }
        .map { it.second }
        .groupingBy { it }
        .eachCount()
    val output = map.values.toList().sumOf { it * it }.toString()
    BufferedWriter(System.out.writer()).use { it.write(output) }
}