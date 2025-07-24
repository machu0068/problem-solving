import java.io.BufferedWriter

fun main() {
    BufferedWriter(System.out.writer()).use {
        var a = 2
        var b = 5
        a = b.also { b = a }
        val output = buildString {
            appendLine(a)
            appendLine(b)
        }
        it.write(output)
    }
}