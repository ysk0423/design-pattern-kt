abstract class AbstractDisplay {

    abstract fun open()
    abstract fun print()
    abstract fun close()

    fun display() {
        open()
        for (i in 0..4) {
            print()
        }
        close()
    }

}