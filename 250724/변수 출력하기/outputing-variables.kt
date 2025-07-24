import java.io.BufferedWriter

fun main() {
    val a = 3
    val b = 'C'
    BufferedWriter(System.out.writer()).use {
        it.write("$a...$b")
    }
}