object Unit1 {
    def main(args: Array[String]): Unit = {
        // println returns "nothing", and this "nothing"
        // has type "Unit".
        val x:Unit = println("world")
        // Type of y is "Unit"; it is inferred
        // by Scala.
        val y = println("hello")
        // The only object of type "Unit" is (), it
        // is printed as () itself.
        println(x)
        println(y)
        val z = ()
        println(z)
    }
}		
