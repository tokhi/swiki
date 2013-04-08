package controllers;

import java.util.List;

import models.Article;
import play.api.libs.*;
import play.data.Form;
import play.db.ebean.Model;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.index;

public class Application extends Controller {
  
    public static Result index() {
        return ok(index.render("Hello world playframework!"));
    }
    
    public static Result addArticle(){
    	Article article = Form.form(Article.class).bindFromRequest().get();
    	article.save();
    	return redirect(routes.Application.index());
    	
    }
    
    public static Result getArticles(){
    	List<Article> articles = new Model.Finder(String.class, Article.class).all();
    	return ok(Json.toJson(articles));
    }
  
}
