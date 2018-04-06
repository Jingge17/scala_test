package cn.liul.scala.scala3

/**
  * 柯里化
  */
object ScalaDemo2 extends  App {
  def m(x:Int)=(y:Int)=>x*y
  def n(x:Int)(y:Int)=x*y
  val m1=m(2)
  val m2=m1(3)
  println(m2+"   "+m(2)(3)+"   "+n(2)(3))









}
