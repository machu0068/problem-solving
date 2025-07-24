import java.io.BufferedWriter

fun main() {
    BufferedWriter(System.out.writer()).use {
        var a = 5
        var b = 6
        val c = 7
        a = c
        b = c
        val output = buildString {
            append("$a $b $c")
        }
        it.write(output)
    }
}