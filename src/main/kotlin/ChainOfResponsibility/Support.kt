package ChainOfResponsibility

abstract class Support(var name: String) {
    // 遅延初期化
    // Global変数初期化に使用する
    // 初期化を遅らせているだけなので、どこかで初期化する必要がある
    private var next: Support? = null
    fun setNext(next: Support): Support {
        this.next = next
        return this.next!!
    }
    fun support(trouble: Trouble) {
        if (resolve(trouble)) done(trouble)
        else if (next != null) next?.support(trouble)
        else fail(trouble)
    }
    private fun done(trouble: Trouble) = println("${trouble} is resloved by ${this}")
    private fun fail(trouble: Trouble) = println("${trouble} can't be resolved")
    override fun toString(): String = "[${name}]"
    // 具体的な処理はサブクラスに任せる
    protected abstract fun resolve(trouble: Trouble): Boolean
}