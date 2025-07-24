import java.io.BufferedWriter

fun main() {
    BufferedWriter(System.out.writer()).use {
        val a = 25.352
        val output = buildString {
            append("%.1f".format(a))
        }
        it.write(output)
    }
}