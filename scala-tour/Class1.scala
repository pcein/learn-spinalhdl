class Student {
    val firstName = "Foo"
    val lastName = "Bar"
    
    def name = firstName + " " + lastName
}

object Class1 {
    def main(args: Array[String]):Unit = {
        val s = new Student
        println(s.name)
    }
}
