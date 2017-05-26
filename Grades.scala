import io.StdIn._

object Grades extends App {
  var done = false
  while (!done)
  {
    var name = readLine("Enter the Student name:")
    println("Enter student score: ")
    var score = readDouble()
    println("You recieved an " + (if(score<=100) "A" else
      if(score <= 80) "B" else
        if(score <= 70) "C" else
          if(score <= 60) "D" else
            if(score < 50) "F"))
    println("Enter true if done, false to continue: ")
    done = readBoolean()
  }
}

