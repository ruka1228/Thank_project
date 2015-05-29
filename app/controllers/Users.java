package controllers;

import java.util.List;

import models.User;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.users.*;

public class Users extends Controller {
    public static Form<User> userForm = Form.form(User.class);

//    //ユーザのリスト表示
//    public static Result index() {
//        List<User> users = User.find.all();
//        return ok(index.render(users));
//    }
//
//    public static Result newUser() {
//        return ok(newForm.render(userForm));
//    }
//
//    //ユーザの作成
//    public static Result createUser() {
//        Form<User> form = userForm.bindFromRequest();
//
//        if (form.hasErrors()) {
//            return badRequest(newForm.render(form));
//        }
//
//        User user = form.get();
//        User.create(user.name, user.password);
//        return redirect(routes.Users.index());
//    }


    //--------------------------------------------------

    //listの表示
    public static Result index() {
        List<User> userList = User.find.all();
        return ok(index.render(userList,userForm));
    }

    //フォームで入力した情報をDBに保存
    public static Result createUser() {
        Form<User> form = userForm.bindFromRequest();

        if (form.hasErrors()) {
            List<User> userList = User.find.all();

            // 制約エラーが発生したら、その情報を持つ form を渡してあげる
            return badRequest(index.render(userList, form));
        } else {
            User newUser = form.get();
            newUser.save();
            return redirect(routes.Users.index());
        }
    }
}