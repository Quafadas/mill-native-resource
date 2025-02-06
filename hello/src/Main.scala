
@main def main(): Unit = {
    val source = this.getClass().getResourceAsStream("sample.txt").readAllBytes()
    println(source.mkString)
  }

