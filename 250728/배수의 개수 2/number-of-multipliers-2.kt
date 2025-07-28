import java.io.BufferedReader
import java.io.BufferedWriter

fun main() {
    val result = BufferedReader(System.`in`.reader()).use { br ->
        val array = Array(10) { br.readLine().toInt() }
        array.filter { it % 2 != 0 }.size
    }
    BufferedWriter(System.out.writer()).use { it.write(result.toString()) }
}