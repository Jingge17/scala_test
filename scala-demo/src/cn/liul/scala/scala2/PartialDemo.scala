package cn.liul.scala.scala2

/**
  * 偏函数
  */
object PartialDemo {
def fun1:PartialFunction[String,Int]={//[String,Int]分别为输入输出
  case "one"=>1
  case "two"=>2
}
  def fun2(num:String):Int=num match {
    case "one"=>1
    case "two"=>2
    case _ => -1
  }

  def main(args: Array[String]): Unit = {
    println(fun1("one"));println(fun2("one"))
  }
}
