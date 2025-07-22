import java.io.BufferedReader
import java.io.BufferedWriter

fun main() {
    val br = BufferedReader(System.`in`.reader())
    val n = br.readLine().toInt()
    BufferedWriter(System.out.writer()).use {
        it.write(n.toString())
        it.newLine()
        if (n < 0) {
            it.write("minus")
        }
    }
}