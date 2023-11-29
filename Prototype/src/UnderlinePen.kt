import framework.Product

class UnderlinePen(
    private val ulchar: Char
): Product {
    override fun use(s: String) {
        val length = s.toByteArray().size
        println("\"$s\"")
        print(" ")
        for (i in 0 until length) {
            print(ulchar)
        }
        println("")
    }

    override fun createClone(): Product? {
        return runCatching {
            clone() as Product
        }.onFailure {
                e -> e.printStackTrace()
        }.getOrNull()
    }
}