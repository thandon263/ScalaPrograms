
import io.Source._

object readFromFiles extends App {
  val fileName = "src/rainbow.txt"  
  for(line <- fromFile(fileName).getLines()){
    println(line)
  }
  
}