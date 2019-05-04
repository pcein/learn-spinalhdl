import scala.language.postfixOps
object Operators1 {
    def main(args: Array[String]): Unit = {
            val msg = "Hello,world"
            val newmsg = msg.toUpperCase
            val newmsg2 = (msg toUpperCase)
            println("newmsg = "+ newmsg)
            println("newmsg2 = " + newmsg2)
    }
}		
