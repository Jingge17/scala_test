package cn.liul.scala.scala3

/**
  * 隐式转换
  */

class Rich(val rv: Int){
  def getv=rv*2
}

object Rich{
  implicit def rvrich(rv:Int)=new Rich(rv)
}

object ScalaDemo3{

  def main(args: Array[String]): Unit = {
    import Rich._
    val in:Int=3

    println(in.getv+"   "+3.getv)
  }
}
