package ChainOfResponsibility

class Trouble(var number: Int) {
    override fun toString(): String = "[Trouble ${number}]"
}