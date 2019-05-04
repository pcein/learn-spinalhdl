object ValAndVar3 {
    def main(args: Array[String]): Unit = {
        val x = Array(1, 2, 3)
        // No problem, can modify "x" because it is a
        // mutable scala object.
        x(0) = 10
        println(x(0))
    }
}		
