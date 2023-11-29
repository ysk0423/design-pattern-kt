package framework

class Manager {
    private val showcase = hashMapOf<String, Product>()

    fun register(name: String, proto: Product) {
        showcase[name] = proto
    }

    fun create(protoName: String): Product? {
        val p: Product = showcase[protoName] as Product
        return p.createClone()
    }
}