import org.apache.spark.sql.SparkSession

object SampleApp {

  def main(args:Array[String]): Unit ={

    val spark = SparkSession.builder()
      .master("spark://spark:7077")
      .appName("spark-sample-app")
      .getOrCreate();
    
    println("SparkContext:")
    println("APP Name :"+spark.sparkContext.appName);
    println("Deploy Mode :"+spark.sparkContext.deployMode);
    println("Master :"+spark.sparkContext.master);

  }
}