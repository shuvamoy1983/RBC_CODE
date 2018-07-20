package ScalaFrameWorkForSpark


/**
 * Hello world!
 *
 */

import java.util.Properties
import KafkaUtils.ReadFileFromDirectory
import org.apache.kafka.clients.producer._
import scala.io.Source
import scala.util.Random
import java.io.File
import KafkaUtils._

object App {
  def main(args: Array[String]): Unit = {

    KafkaUtils.KafkaProducer.KafkaConfigurationSetUp
    while (true) {
      KafkaUtils.KafkaProducer.KafkaProducerJob("test3", "/usr/local/src/file")
      Thread.sleep(10000)
    }
  }
}
