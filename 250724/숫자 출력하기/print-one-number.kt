import java.io.BufferedWriter

fun main() {
    val output = StringBuilder().apply {
        append("3")
    }.toString()
    BufferedWriter(System.out.writer()).use {
        it.write(output)
    }
}