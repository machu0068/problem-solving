import java.io.BufferedWriter

fun main() {
    BufferedWriter(System.out.writer()).use {
        var a = 5
        var b = 6
        var c = 7
        Triple(a, b, c).let { (x, y, z) ->
            b = x
            c = y
            a = z
        }
        val output = buildString {
            appendLine(a)
            appendLine(b)
            appendLine(c)
        }
        it.write(output)
    }
}