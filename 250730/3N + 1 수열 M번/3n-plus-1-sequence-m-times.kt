import java.io.BufferedReader
import java.io.BufferedWriter

fun main() {
    val output = BufferedReader(System.`in`.reader()).use { br ->
        val m = br.readLine().toInt()
        buildString {
            repeat(m) {
                val n = br.readLine().toInt()
                val list = generateSequence(n) {
                    if (it % 2 == 0) it / 2 else it * 3 + 1
                }.takeWhile { it != 1 }.toList()
                appendLine(list.size)
            }
        }
    }
    BufferedWriter(System.out.writer()).use { it.write(output) }
}