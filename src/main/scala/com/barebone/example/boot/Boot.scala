package com.barebone.example.boot

import akka.actor.{Props, ActorSystem}
import akka.io.IO
import com.barebone.example.config.Configuration
import com.barebone.example.services.ServiceActor
import spray.can.Http

/**
  * Created by vivafung on 7/16/16.
  */
object Boot extends App with Configuration{
  // create an actor system for application
  implicit val system = ActorSystem("scala-based barebone restAPI")

  //create and start rest service
  val restService = system.actorOf(Props[ServiceActor], "barebone-api")

  // start http server
  IO(Http) ! Http.Bind(restService, serviceHost, servicePort)
}
