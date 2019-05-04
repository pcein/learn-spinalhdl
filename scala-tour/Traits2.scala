sealed trait Option {}

case object None extends Option
final case class Some(x: Int) extends Option

object Traits2 {
    def main(args: Array[String]):Unit = {
        val o1:Option = Some(10)
        val s = o1 match {
            case Some(x) => "Some: " + x
            case None => "None"
        }
        println(s)
    }
}

