class Foo(var x: Int) {
    def := (xx: Int) = {
        x = xx
    }
}

object OperatorFunctions {
    def main(args: Array[String]):Unit = {
        val f = new Foo(10)
        f := 20
        println(f.x)
    }
}

