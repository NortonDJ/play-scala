package controllers

import javax.inject._

import models.User
import play.api.data.Form
import play.api.mvc._
import play.api.data.Forms._
@Singleton
class LoginController @Inject() extends Controller {

    //Actions return html views

    def login = Action{
        Ok(views.html.pages.home())
    }

    def loggedIn = Action{
        Ok(views.html.pages.home())
    }

    def createAcc = Action{
        Ok(views.html.pages.createAcc())
    }

    val userForm: Form[User] = Form{
        mapping(
            "username"-> text,
            "password"-> text,
            "institution"->text
        )(User.apply)(User.unapply)
    }

    def addUser()= Action { implicit request =>
        val user= userForm.bindFromRequest.get
        Redirect(routes.HomeController.index())
    }

}