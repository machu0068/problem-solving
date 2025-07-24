import java.io.BufferedWriter

fun main() {
    val output = buildString {
        appendLine("Total days in Year")
        appendLine("365")
        appendLine("Circumference rate")
        appendLine("3.1415926535")
    }
    BufferedWriter(System.out.writer()).use {
        it.write(output)
    }
}