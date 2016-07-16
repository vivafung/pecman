package com.barebone.example.services

/**
  * Created by vivafung on 7/16/16.
  */

import akka.actor.Actor
import akka.event.slf4j.SLF4JLogging
import spray.http._
import spray.routing._

// REST service actor
class ServiceActor {
  implicit def actorRefFactory = context
  def receive = runRoute(queries)
  println("starting service Actor ... ")

}


// REST service
trait RestService extends HttpService with SLF4JLogging {
  val queries =
  println("in trait of Rest service .....")

}