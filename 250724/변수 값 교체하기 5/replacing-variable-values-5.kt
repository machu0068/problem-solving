import java.io.BufferedWriter

fun main() {
    BufferedWriter(System.out.writer()).use {
        var a = 2
        val b = 6
        a = b
        val output = buildString {
            appendLine(a)
            appendLine(b)
        }
        it.write(output)
    }
}