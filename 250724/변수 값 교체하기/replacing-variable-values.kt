import java.io.BufferedWriter

fun main() {
    BufferedWriter(System.out.writer()).use {
        var a = 3
        a = 6
        it.write(a.toString())
    }
}