package controllers

import javax.inject._
import play.api.mvc._

@Singleton
class HomeController @Inject()(cc: ControllerComponents) extends AbstractController(cc)
{

  def index() :Action[AnyContent] = Action { implicit request: Request[AnyContent] =>
    Ok("Welcome!").withSession("connected" -> "user@gmail.com")
  }

  def help() :Action[AnyContent] = Action { implicit request: Request[AnyContent] =>
    Ok(request.session.get("connected").getOrElse("User is not logged in"))
  }


}
