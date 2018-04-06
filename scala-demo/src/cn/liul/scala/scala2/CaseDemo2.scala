package cn.liul.scala.scala2

/**
  * 样例类
  */

case class aaa(id:Int,name:String)//多例
case class bbb()
case object ccc//单例

object CaseDemo2 extends App {

aaa(1,"abc") match {
  case aaa(id,name)=>{
    println(s"${id}   $name")
  }
  case bbb=>{
    println("bbb")
  }
  case ccc=>{
    println("ccc")
  }

}

}
