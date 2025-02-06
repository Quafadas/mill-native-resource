object Main {
  def main(args: Array[String]): Unit = {
    val source = scala.io.Source.fromResource("sample.txt")
    val content = try source.mkString finally source.close()
    println(content)
  }
}
