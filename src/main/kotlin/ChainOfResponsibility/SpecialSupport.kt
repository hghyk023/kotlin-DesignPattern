package ChainOfResponsibility

class SpecialSupport(name: String, var number: Int) : Support(name) {
    override fun resolve(trouble: Trouble): Boolean {
        if (trouble.number == number) return true
        return false
    }
}