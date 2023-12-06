package factory

import kotlin.reflect.full.createInstance

abstract class Factory {

    abstract fun createLink(caption: String, url: String): Link
    abstract fun createTray(caption: String): Tray
    abstract fun createPage(title: String, author: String): Page

    companion object {
        fun getFactory(className: String): Factory? {
            return runCatching {
                val factory = Class.forName("$className").kotlin
                factory.createInstance() as Factory
            }.onFailure {
                    e -> e.printStackTrace()
            }.getOrNull()
        }
    }
}