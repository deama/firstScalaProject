package controllers

import javax.inject._
import authentication.AuthenticationAction
import play.api.mvc._

@Singleton
class HomeController @Inject()(cc: ControllerComponents, authAction: AuthenticationAction) extends AbstractController(cc)
{
  def index() :Action[AnyContent] = authAction
  {
    Ok( views.html.index("Your new application is ready.") )
  }

  def index2() :Action[AnyContent] = Action { implicit request :Request[AnyContent] =>
    Ok( views.html.index("THING") )
  }
}
