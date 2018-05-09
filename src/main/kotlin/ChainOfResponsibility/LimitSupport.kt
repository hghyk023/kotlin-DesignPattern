package ChainOfResponsibility

class LimitSupport(name: String, var limit: Int) : Support(name) {
    override fun resolve(trouble: Trouble): Boolean {
        if (trouble.number < limit) return true
        else return false
    }
}