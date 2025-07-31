fun main() {
    val array = arrayOf('L', 'E', 'B', 'R', 'O', 'S')
    val c = readln().first()
    var position: Int? = null
    array.forEachIndexed { index, e ->
        if (e == c) {
            position = index
        }
    }
    print(position ?: "None")
}