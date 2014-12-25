package org.wq.mvn4spark.demo4scala


import org.scalatest.FunSuite

/**
 * Created by wq on 14/12/25.
 */
class TestHello extends FunSuite{

  test("sayHello"){
    val hello = new Hello
    assert(hello.sayHello("scala") == "hello,scala")
  }

  test("other one"){
    val hello = new Hello
    assert(hello.sayHello("scala") == "hello,scala")
  }

}
