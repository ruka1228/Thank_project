package controllers;

import play.*;
import play.mvc.*;

import views.html.*;

public class Application extends Controller {

//    public static Result index() {
//        return ok(index.render("Your new application is ready."));
//    }

//    public static Result login(){
//    	return ok(login.render());
//    }

    public static Result staffMenu(){
    	return ok(staffMenu.render());
    }

    public static Result adminMenu(){
    	return ok(adminMenu.render());
    }

    public static Result thanksEntry(){
    	return ok(thanksEntry.render());
    }

    public static Result boardList(){
        Finder<Integer,Thankyou> finder = new Finder<Integer, Thankyou>(Integer.class,
                Thankyou.class);
        List<Thankyou> ThankyouList = finder.all();
    	return ok(boardList.render(ThankyouList));
    }

    public static Result board(){
    	return ok(board.render());
    }

    public static Result send(){
    	return ok(send.render());
    }

    public static Result receive(){
    	return ok(receive.render());
    }

    public static Result userManage(){
    	return ok(userManage.render());
    }

    public static Result postManage(){
    	return ok(postManage.render());
    }

    public static Result addUser(){
    return ok(addUser.render());
    }

    public static Result userPlus(){
        User newUser = Form.form(User.class).bindFromRequest().get();
           newUser.save();
           return redirect(routes.Application.Login());
   }

//    public static Result addPost(){
//    	Department newDepartment = Form.form(Department.class).bindFromRequest().get();
//    	newDepartment.save();
//        return redirect(routes.Application.login());
//    }
//
//    public static Result addClass(){
//    	Section newSection = Form.form(Section.class).bindFromRequest().get();
//    	newSection.save();
//        return redirect(routes.Application.login());
//    }
//
//    public static Result check(){
//    	return TODO;
//    }
//
    public static Result deleteUser(){
    	return ok(deleteUser.render());
    }

    public static Result deletePost(){
    	return ok(deletePost.render());
    }

    public static Result deleteClass(){
    	return ok(deleteClass.render());
    }

    public static Result vote(){
    	return ok(vote.render());
    }

    public static Result search(){
    	return ok(search.render());
    }
    public static Result count(){
    	return ok(count.render());
    }
    public static Result check(){
    	return ok(check.render());
    }

}
