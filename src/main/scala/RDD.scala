import org.apache.spark.{SparkConf, SparkContext}

object RDD {

  def main(args: Array[String]): Unit = {

    val conf = new SparkConf().setAppName("wocao").setMaster("local[*]")
    val sc = new SparkContext(conf)

    sc.parallelize(Array(1,2,4,5)).repartition(1)

    val h = 2
    var j = 5
  }
}
