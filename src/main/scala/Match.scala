object Match {
  def intToName(num: Int):String = {
    num match {
      case 1 => "one"
      case 2 => "two"
      case _ => "other"
    }
  }

  def message(message: String): String = {
    message match {
      case "good" | "bad" => "game"
    }
  }

  def patternMatch(): Unit = {
    val seq = Seq("A", "B", "C", "D", "E")
    seq match {
      case Seq("A", b, c, d, e) =>
        println("b = " + b)
        println("c = " + c)
        println("d = " + d)
        println("e = " + e)
      case _ =>
        println("nothing")
    }
  }

  def patternMatchNest(): Unit = {
    val seq = Seq(Seq("A"), Seq("B", "C", "D", "E"))
    seq match {
      case Seq(x, b@Seq("B")) => {
        println(x)
        println(b)
      }
      case _ => println("nothing")
    }
  }

  def patternMatchGenerics(): Unit = {
    var obj: AnyRef = Seq("a", "b", "c")
    obj match {
      case v: Seq[_] => println("Seq[_]")
      case _ => println("nothing")
    }
  }
}
