object Mapreduce {
  def main(args: Array[String]): Unit = {
    val text:String = scala.io.Source.fromFile("dante.txt").mkString
    val words = text.split("\\W")

    val collections:scala.collection.immutable.Map[String, Array[String]] = words.groupBy( word => word )
    val counts = collections.map(couple => (couple._1, couple._2.length))

    counts.foreach(p => println(p._1 + " -> " + p._2))
    println ("Words: " + counts.size)
  }
}

