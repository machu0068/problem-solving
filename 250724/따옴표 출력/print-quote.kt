import java.io.BufferedWriter

fun main() {
    BufferedWriter(System.out.writer()).use {
        it.write("He says \"It's a really simple sentence\".")
    }
}