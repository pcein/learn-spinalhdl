// "val x" and "val y" is not required; 
// "x" and "y" automatically become fields
// of the created object.
case class Foo(x: Int, y: Int) { }

object CaseClass2 {
    def check(f: Foo):String = {
        f match {
            case Foo(0, 0) => "Both x and y 0"
            case Foo(0, y) => "x is zero, y may be non zero"
            case Foo(-1, -1) => "x and y are -1"
            case Foo(_, _) => "default case"
        }
    }

    def main(args: Array[String]):Unit = {
        val f1 = Foo(1, 2)
        println(CaseClass2.check(f1))
        val f2 = Foo(-1, -1)
        println(CaseClass2.check(f2))
    }
}

