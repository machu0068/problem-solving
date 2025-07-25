import java.io.BufferedReader
import java.io.BufferedWriter

fun main() {
    var a = BufferedReader(System.`in`.reader()).use {
        it.readLine().toInt()
    }
    if (a % 2 == 1) {
        a += 3
    }
    if (a % 3 == 0) {
        a /= 3
    }
    BufferedWriter(System.out.writer()).use {
        it.write(a.toString())
    }
}