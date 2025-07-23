import java.io.BufferedReader
import java.io.BufferedWriter

fun main() {
    val br = BufferedReader(System.`in`.reader())
    val str = StringBuilder(br.readLine()).apply {
        this[1] = 'a'
        this[this.lastIndex - 1] = 'a'
    }
    BufferedWriter(System.out.writer()).use {
        it.write(str.toString())
    }
}