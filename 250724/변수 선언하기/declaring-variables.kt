import java.io.BufferedWriter

fun main() {
    val a = 3
    val b = 'C'
    val output = buildString {
        appendLine(a)
        appendLine(b)
    }
    BufferedWriter(System.out.writer()).use {
        it.write(output)
    }
}