import java.io.BufferedWriter

fun main() {
    val a = 7
    val b = 23
    val c = 30
    BufferedWriter(System.out.writer()).use {
        it.write("$a + $b = $c")
    }
}