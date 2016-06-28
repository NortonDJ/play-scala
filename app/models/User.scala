package models

import play.api.libs.json.Json

/**
  * Created by Darren on 6/27/2016.
  */
case class User(username: String, password: String, institution: String)

object User{
  implicit val userFormat= Json.format[User]
}
