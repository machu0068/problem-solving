import java.io.BufferedReader
import java.io.BufferedWriter

fun main() {
    val br = BufferedReader(System.`in`.reader())
    val a = br.readLine().toInt()
    BufferedWriter(System.out.writer()).use {
        it.write("${a + 2}")
    }
}