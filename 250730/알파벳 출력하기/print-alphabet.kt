import java.io.BufferedReader
import java.io.BufferedWriter

fun main() {
    val n = BufferedReader(System.`in`.reader()).use { it.readLine().toInt() }
    val iterator = generateSequence('A') { if (it == 'Z') 'A' else it + 1 }.iterator()
    val output = (1..n).joinToString("\n") { i ->
        (1..i).joinToString("") {
            iterator.next().toString()
        }
    }
    BufferedWriter(System.out.writer()).use { it.write(output) }
}