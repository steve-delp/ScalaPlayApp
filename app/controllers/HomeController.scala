package controllers

import javax.inject.Inject
import javax.inject.Singleton

import play.api.mvc._
import play.twirl.api.Html

import scala.util.{Failure, Success, Try}

@Singleton
class HomeController @Inject()(cc: ControllerComponents) extends AbstractController(cc) {

    def index() = Action {
        Ok("Hello, World!!!")
    }

  }
