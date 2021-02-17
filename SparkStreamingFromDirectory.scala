object SparkStreamingFromDirectory {

  def main(args: Array[String]): Unit = {
    var i = 1
    val r = scala.util.Random
    var k = 0
    r.nextInt(100)
    while(i<20) {
      val sourceFilename = new File("C:/Users/utkarsh.yadav/Desktop/Stream/folder_streaming/Zipcode - Copy ("+i+").json").toPath
      val destinationFilename = new File("C:/Users/utkarsh.yadav/Desktop/Stream/GatewayRegistrationStream/Zipcode - Copy ("+i+").json").toPath
      Files.copy(sourceFilename, destinationFilename, StandardCopyOption.REPLACE_EXISTING)
      println("Streaming s1 - Copy("+i+").json file")
      k=r.nextInt(8)*10000
      Thread.sleep(k)
      i=i+1;
    }
  }
}
