package idcard

import framework.Factory
import framework.Product

class IDCardFactory: Factory() {

    private val owners = mutableListOf<String>()
    override fun createProduct(owner: String): Product {
        return IDCard(owner)
    }

    override fun registerProduct(product: Product) {
        owners.add((product as IDCard).owner)
    }
}