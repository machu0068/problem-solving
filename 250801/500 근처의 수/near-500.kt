import java.io.BufferedReader
import java.io.BufferedWriter
import java.util.StringTokenizer

fun main() {
    BufferedReader(System.`in`.reader()).use { br ->
        val array = StringTokenizer(br.readLine()).run {
            Array(10) { nextToken().toInt() }
        }
        val (lessThan500, greaterThan500) = array.partition { it <= 500 }
        val output = listOf(
            lessThan500.maxOrNull(),
            greaterThan500.minOrNull()
        ).joinToString(" ")
        BufferedWriter(System.out.writer()).use { it.write(output) }
    }
}