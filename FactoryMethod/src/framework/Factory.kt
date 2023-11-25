package framework

abstract class Factory {
    fun create(owner: String): Product {
        val p: Product = createProduct(owner)
        registerProduct(p)
        return p
    }

    abstract fun createProduct(owner: String): Product
    abstract fun registerProduct(product: Product)
}