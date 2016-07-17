package com.barebone.example.services

/**
  * Created by vivafung on 7/16/16.
  */

import akka.actor.Actor
import akka.event.slf4j.SLF4JLogging
import spray.http._
import spray.routing._

// REST service actor
class ServiceActor extends Actor with RestService{
  println("starting service Actor ... ")
  implicit def actorRefFactory = context
  def receive = runRoute(eventsRoute)


}

// REST service, this trait defines the services bahavior independently

trait RestService extends HttpService with SLF4JLogging {
  println("in trait of Rest service .....")
  val eventsRoute = {
    path("eventquery") {
      get {
        complete {
          "The first GET point !!! "
        }
      }
    }
  }


}