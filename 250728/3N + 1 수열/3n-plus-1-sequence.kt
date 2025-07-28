import java.io.BufferedReader
import java.io.BufferedWriter

fun main() {
    val n = BufferedReader(System.`in`.reader()).use { it.readLine().toInt() }
    val count = generateSequence(n) { n ->
        if (n % 2 == 0) n / 2 else n * 3 + 1
    }
        .takeWhile { it != 1 }
        .count()
    BufferedWriter(System.out.writer()).use { it.write(count.toString()) }
}