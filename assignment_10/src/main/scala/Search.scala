import java.io.File
import java.nio.file.{FileSystem, FileSystems, Files}
import javax.sound.sampled.Line
import scala.List
import scala.collection.immutable
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Future
import scala.jdk.CollectionConverters.IteratorHasAsScala
class Search {
  def file(path: String): Future[List[String]] = Future {
    val dir = FileSystems.getDefault.getPath(path)
    if (dir.toFile.isDirectory && dir.toFile.exists()) {
      val result = List(Files.walk(dir).iterator().asScala.foreach(println).toString)
      result
    }
    else
      List("path is not valid")
  }
}
