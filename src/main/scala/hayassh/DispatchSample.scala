package hayassh

import org.specs2._
import org.junit.runner.RunWith
import org.specs2.runner.JUnitRunner
import dispatch._,Defaults._
import scala.util.{Success, Failure}
import scala.util.parsing.json.JSON
import org.json4s._
import org.json4s.native.JsonMethods._

@RunWith(classOf[JUnitRunner])
class DispatchSample extends Specification{
  def is = s2"""
    sample1 ${actual must beEqualTo(expected)}
"""
 
  def actual = {
    var request = url("http://jsonplaceholder.typicode.com/posts/1")
    var response = Http(request OK as.json4s.Json)
    response()
  }
  
  def expected = parse("""
{
  "userId": 1,
  "id": 1,
  "title": "sunt aut facere repellat provident occaecati excepturi optio reprehenderit",
  "body": "quia et suscipit\nsuscipit recusandae consequuntur expedita et cum\nreprehenderit molestiae ut ut quas totam\nnostrum rerum est autem sunt rem eveniet architecto"
}
    """);
}