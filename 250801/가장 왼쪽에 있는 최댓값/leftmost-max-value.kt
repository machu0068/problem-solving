import java.io.BufferedReader
import java.io.BufferedWriter
import java.util.StringTokenizer

fun main() {
    BufferedReader(System.`in`.reader()).use { br ->
        val n = br.readLine().toInt()
        val input = StringTokenizer(br.readLine()).run {
            List(n) { nextToken().toInt() }
        }
        val output = generateSequence(input) { list ->
            val max = list.maxOrNull() ?: return@generateSequence null
            val index = list.indexOfFirst { it == max }
            if (index == 0) null else list.take(index)
        }.map { it.indexOfFirst { num -> num == it.maxOrNull() } + 1 }
            .toList()
            .joinToString(" ")
        BufferedWriter(System.out.writer()).use { it.write(output) }
    }
}