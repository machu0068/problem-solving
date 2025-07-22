import java.io.BufferedWriter

fun main() {
    var (a, b, c) = listOf(1, 5, 3)
    a = c
    a = a + c
    b = b - c
    BufferedWriter(System.out.writer()).use {
        it.write(a.toString())
        it.newLine()
        it.write(b.toString())
        it.newLine()
        it.write(c.toString())
    }
}