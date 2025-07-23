import java.io.BufferedWriter

fun main() {
    val a = arrayOf(3, 1, 4, 5, 9)
    BufferedWriter(System.out.writer()).use {
        it.write("${a[1] + a[3] + a[4]}")
    }
}