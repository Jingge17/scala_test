package cn.liul.scala.scala2

import scala.util.Random

/**
  * 模式匹配
  */
object CaseDemo extends App {
val id=1
  val arr = Array(1, "3", 5)
  val arr2 = Array(1, 2, 5)
  val lst=List(3,-1)
/*  id match {
    case 1=>println("1")
    case _=>println("default")
  }*/

/*  arr(Random.nextInt(3)) match {
    case x:Int if(x >= 0)=>println(x)
    case y: String =>println(y)
    case _=>println("none")
  }*/

/*  arr2 match {
    case Array(0,x,y) =>println(x+"   "+y)
    case Array(1,_*)=>println("matched")
    case _=>println("none")
  }*/

  lst match {
    case 0::Nil=>println("only 0")
    case x::y::Nil=>println("match two "+s"$x   $y")
    case 0::tail=>println("0... ")
    case _=>println("none")
  }
}
