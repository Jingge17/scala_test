package cn.liul.scala

import scala.collection.mutable
object HelloScala {
  def m1(x:Int,y:Int):Int=x*y//方法

  val f1=(x:Int,y:Int)=>{x+y}//函数

  val f3:Int=>Int={x=>x*2}//函数   val函数名:函数类型=>返回类型={参数=>函数体}

  val f2=(x:Int)=>x*2

  def m2(f:Int=>Int):Int={//方法(函数为参数)
    f(3)
  }

  def main(args: Array[String]){
//    println("hello scala")

//    for(i<-1 to 10)
//      println(i)

//      for(i<-1.to(10))
//       println(i)

//    val arr=Array(1,2,3)
//    for (a<-arr)
//      println(a)


//    for (i<-1 to 3;j<-1 to 3 if i!=j)
//      println(i+" "+j)

//    val arr=for (i<- 1 to 3) yield i*2
//    println(arr)

//    val arr=Array(1,2,3,4)
//    val arr2=arr.filter(_%2==0)
//    println(arr2.length)

//      for(i<- 0 until 3)
//        println(i)

//      println(m1(2,2))
//      println(f1(2,2))

/*    val arr=Array(1,2,3,4)
    val ma1=arr.map(_*2)
    val ma2=arr.map(f2)
    val ma3=arr.map(x=>x*2)
    for (i<-0 until ma1.length) {
      println(ma1(i))
      println(ma2(i))
      println(ma3(i))
    }
    println(ma3.toBuffer)*/

//    println(m2(f2))

//    println(f3(2))

/*    var ma1=mutable.Map(("a",1),("b",2))
    ma1("c")=3
    println(ma1.toBuffer)

    val li1=List(1,3,2)
    println(li1.sorted.toBuffer)

    val se1=mutable.Set("a","b")
    se1 += "c"
    println(se1.toBuffer)*/

/*    val arr1=Array(1,2)
    val arr2=Array(3,4)
    val arr3=Array(arr1,arr2)
    println(arr1.zip(arr2).toBuffer)
    println(arr3.flatten.toBuffer)*/

    //分割和统计个数
/*    val arr4=Array("ab cd ef gh","hi jk cd ab")
    val arr5=arr4.flatMap(_.split(" "))
    println(arr5.toBuffer)
    val arr6=arr5.map((_,1))
    println(arr6.toBuffer)
    val arr7=arr6.groupBy(_._1)//groupBy是分组  _._1是一个元素的第一列 ex：ArrayBuffer((ab,2), (cd,2), (hi,1), (gh,1), (ef,1), (jk,1)) 其中 _为(ab,2) _._1为ab
    println(arr7.toMap)
    val arr8=arr7.map(t=>(t._1,t._2.size))
    println(arr8.toMap)
    val arr9=arr8.toList.sortBy(_._2).reverse
    println(arr9.toBuffer)*/

/*    val arr1=Array(1,2,3,4,5,6)
    val parr1=arr1.par//多线程计算（线程数取决于本机cpu核数）
    val sum1=parr1.reduce(_+_)//求和(...((1+2)+3)...)      _+_ 第一个_为初始或累加的值第二个_是集合中的值
    println(sum1)
    val sum2=arr1.fold(5)(_+_)//求和(...(((5+1)+2)+3)...)
    println(sum2)
    val sum3=parr1.fold(5)(_+_)//多线程求和不准确每个线程都会添加初始值5  可设置fold（0）
    println(sum3)*/
  }
}
