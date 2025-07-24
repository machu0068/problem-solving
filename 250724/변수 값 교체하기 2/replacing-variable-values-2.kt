import java.io.BufferedWriter

fun main() {
    BufferedWriter(System.out.writer()).use {
        var a = 5
        val b = 3
        a = b
        val output = buildString {
            appendLine(a)
            appendLine(b)
        }
        it.write(output)
    }
}