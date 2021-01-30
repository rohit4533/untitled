package rohit
import org.apache.spark.SparkConf
import org.apache.spark.SparkContext
object pari extends App {
  val sparkConf=new SparkConf().setAppName("This is sample Program").setMaster("local")
  val sc= new SparkContext(sparkConf)
  //val sc1= new SparkContext(sparkConf)
  sc.setLogLevel("ERROR")
  val rdd=sc.textFile("file:///C:/Bigdata/test.txt")
  rdd.foreach(println)
}
