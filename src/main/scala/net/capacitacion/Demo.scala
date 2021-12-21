package net.capacitacion

import org.apache.spark.sql.{DataFrame, SparkSession}

object Demo {

  var nameApp = "CapacitacionSpark"
  var pathInput = "input/MOCK_DATA_1.csv"
  var delimitador = "|"

  val spark: SparkSession = SparkSession.builder
    .appName(nameApp)
    .master("local[*]")
    .getOrCreate()

  var dfInputData: DataFrame = spark.emptyDataFrame


  def main(args: Array[String]): Unit = {







  }


}
