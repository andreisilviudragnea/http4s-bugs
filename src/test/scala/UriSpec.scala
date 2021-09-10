import org.http4s.Uri
import org.http4s.implicits.http4sLiteralsSyntax
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers._

class UriSpec extends AnyFunSuite with should.Matchers {
  test("0.21.28") {
    uri"example.com".addPath("/path") should be(Uri.unsafeFromString("example.com/path"))
    uri"/path" should be(Uri.unsafeFromString("/path"))
    uri"".addPath("path") should be(Uri.unsafeFromString("/path"))
    uri"".addPath("/path") should be(Uri.unsafeFromString("/path"))
  }

  test("0.22.0-M1") {
    uri"example.com".addPath("/path") should be(Uri.unsafeFromString("example.com//path"))
    uri"/path" should be(Uri.unsafeFromString("/path"))
    uri"".addPath("path") should be(Uri.unsafeFromString("/path"))
    uri"".addPath("/path") should be(Uri.unsafeFromString("//path")) // this always fails
  }
}
