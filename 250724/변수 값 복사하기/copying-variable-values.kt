import java.io.BufferedWriter

fun main() {
    BufferedWriter(System.out.writer()).use {
        var a = 1
        var b = 2
        val c = 3
        a = c
        b = c
        val output = buildString {
            append("$a $b $c")
        }
        it.write(output)
    }
}