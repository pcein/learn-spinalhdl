// "val x" and "val y" is not required; 
// "x" and "y" automatically become fields
// of the created object.
case class Foo(x: Int, y: Int) { }

object CaseClass1 {
    def main(args: Array[String]):Unit = {
        val f1 = new Foo(1, 2)
        println(f1.x)
        // For a case class, a companion object is automatically
        // created.
        val f2 = Foo(1, 2)
        println(f2.x)
    }
}

