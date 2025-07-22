import java.io.BufferedReader
import java.io.BufferedWriter

fun main() {
    val br = BufferedReader(System.`in`.reader())
    val n = br.readLine().toInt()
    BufferedWriter(System.out.writer()).use {
        if (n >= 80) {
            it.write("pass")
        } else {
            it.write("${80 - n} more score")
        }
    }
}