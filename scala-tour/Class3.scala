class Student(val firstName: String, val lastName: String) {
    def name = firstName + " " + lastName
}

object Class3 {
    def main(args: Array[String]):Unit = {
        val s = new Student("Foo", "Bar")
        println(s.name)
    }
}
