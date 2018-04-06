package cn.liul.scala.scala2

import cn.liul.scala.ScalaBean

//extends IScalaBean with 接口 with ...
private[scala] class Scala2Bean extends IScalaBean {//只能在scala包或其子包下使用
  override def run2: Unit = {
    println("IScalaBean run2")
  }
}

object ScaleApply{//apply 为其构成方法自动调用
  def  apply(): Unit ={
    println("kong")
  }
  def apply(x:Int)={
    println(x)
  }

  def main(args: Array[String]): Unit = {
    val bean1=ScaleApply()
    val bean2=ScaleApply(123)
  }
}