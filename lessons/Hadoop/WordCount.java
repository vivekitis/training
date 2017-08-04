import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaPairRDD;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;
import scala.Tuple2;

import java.util.Arrays;

public class WordCount {
    public static void main(String[] args) {
        String INPUT_FILE = args[0];
        String OUTPUT_FILE = args[1];

        SparkConf sparkConf = new SparkConf().setAppName("spark-word-count");
        JavaSparkContext javaSparkContext = new JavaSparkContext(sparkConf);
        JavaRDD<String> input = javaSparkContext.textFile(INPUT_FILE);
        JavaPairRDD<String, Integer> counts = input.flatMap(x -> Arrays.asList(x.split(",")))
                .mapToPair(x -> new Tuple2<String, Integer>(x, 1))
                .reduceByKey((x, y) -> x + y);

        counts.saveAsTextFile(OUTPUT_FILE);
        javaSparkContext.close();
    }
}