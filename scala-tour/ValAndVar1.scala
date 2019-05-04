object ValAndVar1 {
    def main(args: Array[String]): Unit = {
        val x = Array(1, 2, 3)
        // compile error. Can't rebind a val
        x = Array(10, 20, 30)

    }
}		
