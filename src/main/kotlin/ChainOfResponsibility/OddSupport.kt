package ChainOfResponsibility

class OddSupport(name: String) : Support(name) {
    override fun resolve(trouble: Trouble): Boolean {
        if (trouble.number % 2 == 1) return true
        else return false
    }
}