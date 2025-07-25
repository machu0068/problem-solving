import java.io.BufferedReader
import java.io.BufferedWriter

fun main() {
    var a = BufferedReader(System.`in`.reader()).use {
        it.readLine().toInt()
    }
    if (a % 2 == 0) {
        a /= 2
    }
    if (a % 2 == 1) {
        a = (a + 1) / 2
    }
    BufferedWriter(System.out.writer()).use {
        it.write(a.toString())
    }
}