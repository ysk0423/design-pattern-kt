package factory

abstract class Link(
    caption: String,
    val url: String
) : Item(caption) {
}
