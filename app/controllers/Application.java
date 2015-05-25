package controllers;

import play.*;
import play.mvc.*;

import views.html.*;

public class Application extends Controller {

    public static Result index() {
        return ok(index.render("Your new application is ready."));
    }

    public static Result login(){
    	return TODO;
    }

    public static Result adminMenu(){
    	return TODO;
    }

    public static Result thanksEntry(){
    	return TODO;
    }

    public static Result boardList(){
    	return TODO;
    }

    public static Result board(){
    	return TODO;
    }

    public static Result send(){
    	return TODO;
    }

    public static Result receive(){
    	return TODO;
    }

    public static Result userManage(){
    	return TODO;
    }

    public static Result postManage(){
    	return TODO;
    }

    public static Result addUser(){
    	User newUser = Form.form(User.class).bindFromRequest().get();
    	newUser.save();
        return redirect(routes.Application.login());
    }

    public static Result addPost(){
    	Department newDepartment = Form.form(Department.class).bindFromRequest().get();
    	newDepartment.save();
        return redirect(routes.Application.login());
    }

    public static Result addClass(){
    	Section newSection = Form.form(Section.class).bindFromRequest().get();
    	newSection.save();
        return redirect(routes.Application.login());
    }

    public static Result check(){
    	return TODO;
    }

    public static Result deleteUser(){
    	return TODO;
    }

    public static Result deletePost(){
    	return TODO;
    }

    public static Result deleteClass(){
    	return TODO;
    }

    public static Result vote(){
    	return TODO;
    }

    public static Result search(){
    	return TODO;
    }

    public static Result count(){
    	return TODO;
    }

   }
