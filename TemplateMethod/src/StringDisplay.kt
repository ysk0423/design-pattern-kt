class StringDisplay(
    private val string: String,
    private val witdh: Int = string.toByteArray().size
): AbstractDisplay() {
    override fun open() {
        printLine()
    }

    override fun print() {
        println("|$string|")
    }

    override fun close() {
        printLine()
    }

    private fun printLine() {
        print("+")
        for (i in 0 until witdh) {
            print("-")
        }
        println("+")
    }
}