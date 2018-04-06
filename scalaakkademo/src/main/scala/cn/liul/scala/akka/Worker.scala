package cn.liul.scala.akka

import akka.actor.{Actor, ActorSelection, ActorSystem, Props}
import com.typesafe.config.ConfigFactory

class Worker  extends Actor{

  var master : ActorSelection = _
  override def preStart(): Unit = {
    master = context.actorSelection(s"akka.tcp://MasterSystem@127.0.0.1:17899/user/Master") //需要有/user, Master要和master那边创建的名字保持一致
    master ! "connect"
  }

  override def receive : Receive= {
    case "reply" => {
      println("a reply form master")
    }
  }

}


object Worker {
  def main(args: Array[String]): Unit = {
    val configStr =
      s"""
         |akka.actor.provider = "akka.remote.RemoteActorRefProvider"
         |akka.remote.netty.tcp.hostname = "127.0.0.1"
         |akka.remote.netty.tcp.port = "8877"
       """.stripMargin
    val config = ConfigFactory.parseString(configStr)
    //ActorSystem老大，辅助创建和监控下面的Actor，他是单例的
    val actorSystem = ActorSystem("WorkerSystem", config)
    actorSystem.actorOf(Props(new Worker), "Worker")
    actorSystem.awaitTermination()

  }
}