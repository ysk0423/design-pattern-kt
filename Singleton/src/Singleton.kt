class Singleton private constructor(){

    init {
        println("インスタンスを生成しました。")
    }

    companion object {
        private val singleton: Singleton = Singleton()
        fun getInstance(): Singleton = singleton
    }
}