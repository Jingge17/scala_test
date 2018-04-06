package cn.liul.scala.scala2

/**
  * option类型
  */
object OptionDemo extends  App {
val map=Map("a"->1,"b"->2)
  println(map.get("c")match {//去不到c 返回0
    case Some(i)=>i
    case None=>0
  })


}
