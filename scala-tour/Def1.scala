object Def1 {
    // A function with no arguments.
    // Call like this: Def1.foo
    def foo:String = "hello"
    // A function with one arg
    def sqr(x:Int):Int = x*x
    
    def main(args: Array[String]): Unit = {
        println(Def1.foo)
        println(Def1.sqr(10))
    }
}		
