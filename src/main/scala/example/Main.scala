package example

import com.fasterxml.jackson.databind.ObjectMapper
import java.io.{InputStream, OutputStream, OutputStreamWriter}
import scalaj.http.Http

class Main {
  val mapper = new ObjectMapper()

  def doStuff(in: InputStream, out: OutputStream): Unit = {
    val responseJson = mapper.createObjectNode()
    responseJson.put("statusCode", 200)
    responseJson.put("body", Http("https://httpbin.org/get").asString.body)
    mapper.writeValue(out, responseJson)
  }
}