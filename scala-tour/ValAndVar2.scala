object ValAndVar2 {
    def main(args: Array[String]): Unit = {
        var x = Array(1, 2, 3)
        // No problem, can reassign to a var.
        x = Array(10, 20, 30)
        println(x(0))
    }
}		
