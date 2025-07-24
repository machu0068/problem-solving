import java.io.BufferedWriter

fun main() {
    BufferedWriter(System.out.writer()).use {
        val a = 3
        var b = 4
        b = a
        val output = buildString {
            appendLine("$a $b")
            appendLine(a * b)
        }
        it.write(output)
    }
}