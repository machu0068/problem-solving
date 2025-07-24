import java.io.BufferedWriter

fun main() {
    BufferedWriter(System.out.writer()).use {
        var a = 7
        a = 4
        it.write(a.toString())
    }
}