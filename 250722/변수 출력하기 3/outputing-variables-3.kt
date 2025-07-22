import java.io.BufferedWriter

fun main() {
    val (a, b, c) = Triple(1, 2, 'C')
    BufferedWriter(System.out.writer()).use {
        it.write("$a->$b->$c")
    }
}