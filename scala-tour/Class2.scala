class Student(first: String, last: String) {
    val firstName = first
    val lastName = last
    
    def name = firstName + " " + lastName
}

object Class2 {
    def main(args: Array[String]):Unit = {
        val s = new Student("Foo", "Bar")
        println(s.name)
    }
}
