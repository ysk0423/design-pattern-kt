package framework

interface Product: Cloneable {
    abstract fun use(s: String)
    abstract fun createClone(): Product?
}