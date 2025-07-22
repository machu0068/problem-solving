import java.io.BufferedWriter

fun main() {
    val a = 5
    val b = 30
    val c = a + b
    BufferedWriter(System.out.writer()).use {
        it.write("${c / 8}")
        it.newLine()
        it.write("${c % 8}")
    }
}