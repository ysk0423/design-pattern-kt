import framework.Product
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.DeclaredMemberIndex.Empty

class MessageBox(
    private val decochar: Char
): Product {
    override fun use(s: String) {
        val length = s.toByteArray().size
        for (i in 0 until length + 4) {
            print(decochar)
        }
        println("")
        println("$decochar $s $decochar")
        for (i in 0 until length + 4) {
            print(decochar)
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