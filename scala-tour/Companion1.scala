class Student {
    def apply(n: Int):Int = amount + n
}

object Apply1 {
    def main(args: Array[String]):Unit = {
        val a = new Adder(10)
        val b = a(1) // same as a.apply(1)
        println(b)
    }
}
