package cn.liul.scala

import cn.liul.scala.scala2.Scala2Bean

class ScalaBean {
   val id=123//不可改
  var name="tom"//可改
  private var sex = "male"//只能在其伴生对象中使用 object ScalaBean=class ScalaBean
  private[this] var tel=12345//只能在此类中使用
  var addr :String=_ //缺省自动补空
  private[scala] var fav="none"//只能在scala包或其子包下使用

  def printTel={
    println(tel)
  }
}

object ScalaBean{//伴生对象    object声明相当于java的静态类
  def main(args: Array[String]): Unit = {
    val bean1=new ScalaBean
    bean1.sex="female"
    println(bean1.sex)
  }
}


object mm{
  def main(args: Array[String]): Unit = {
    val bean1=new ScalaBean
    val bean2=new Scala2Bean
    bean1.name="kangkang"
    println(bean1.id+"\t"+bean1.name)
  }
}
