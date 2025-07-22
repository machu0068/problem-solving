import java.io.BufferedWriter

fun main() {
    val (a, b, c) = arrayOf(7, 23, 30)
    BufferedWriter(System.out.writer()).use {
        it.write("$a + $b = $c")
    }
}