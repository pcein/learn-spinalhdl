sealed trait Color {}

case object Red extends Color
case object Green extends Color

object Traits1 {
    def main(args: Array[String]):Unit = {
        val c1:Color = Red
        val s = c1 match {
            case Red => "red"
            case Green => "green"
        }
        println(s)
    }
}

