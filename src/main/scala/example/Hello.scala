package example

import org.robert.SayHello

object Hello extends Greeting with App {
  lazy val sayHello=new SayHello();
  println(sayHello.hello("罗强"))
}

trait Greeting {
  lazy val greeting: String = "hello"
}
