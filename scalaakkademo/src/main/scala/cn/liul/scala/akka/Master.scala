package cn.liul.scala.akka

import akka.actor.{Actor, ActorSystem, Props}
import com.typesafe.config.ConfigFactory

import scala.collection.mutable

class Master extends Actor{
  println("constructor invoked")
  override def preStart(): Unit = {
    println("preStart invoked")
  }

  override def receive :Receive= {
      case "connect" => {
        println("a client connected")
        sender ! "reply"
      }

      case "hello" => {
        println("hello")
      }
  }
}


object Master {
  def main(args: Array[String]): Unit = {


    val configStr =
      s"""
         |akka.actor.provider = "akka.remote.RemoteActorRefProvider"
         |akka.remote.netty.tcp.hostname = "127.0.0.1"
         |akka.remote.netty.tcp.port = "17899"
       """.stripMargin
    val config = ConfigFactory.parseString(configStr)
    //ActorSystem老大，辅助创建和监控下面的Actor，他是单例的
    val actorSystem = ActorSystem("MasterSystem", config)
    //创建Actor, 起个名字
    val master = actorSystem.actorOf(Props[Master], "Master")//Master主构造器会执行
    master ! "hello"  //发送信息
    actorSystem.awaitTermination()  //让进程等待着, 先别结束
  }
}