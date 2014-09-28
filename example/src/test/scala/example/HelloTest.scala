package example

import org.scalatest.FunSuite

/**
 * Created by sariel on 14-9-27.
 */

class HelloTest extends FunSuite {
  test("sayHello method works correctly"){
    val hello = new Hello
    assert(hello.sayHello("Scala")=="Hello,Scala!")
  }
}
