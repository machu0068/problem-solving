import java.io.BufferedWriter

fun main() {
    BufferedWriter(System.out.writer()).use {
        var a = 'C'
        a = 'T'
        it.write(a.toString())
    }
}