package controllers;

import play.data.Form;
import play.mvc.*;
import views.html.*;
import models.User;

public class Authentication extends Controller {
    public static class Login {
        public String name;
        public String password;

        public String validate() {
            if (authenticate(name, password)) {
                return null;
            }
            return "無効なユーザ名とパスワードです";
        }

        private Boolean authenticate(String name, String password) {
            //return (username.equals("admin") && password.equals("1234"));
            return User.authenticate(name, password);
        }
    }

    public static Form<Login> loginForm = Form.form(Login.class);

    //「ログイン中である」という状態をセットする
    public static Result index() {
    	if (session("login") != null) {
    		return ok("あなたは既に " + session("login") + "としてログインしています");
    	}
        return ok(index.render(loginForm));
    }

    //ログアウトの処理
    public static Result logout() {
        session().clear();
        return redirect(routes.Authentication.index());
    }

    //認証に失敗していればログインフォーム再表示
    //認証に成功いていればユーザ名を表示
    public static Result authenticate() {
        Form<Login> form = loginForm.bindFromRequest();

        if (form.hasErrors()) {
            return badRequest(index.render(form));
        } else {
            Login login = form.get();
            session("login", login.name);
            return ok(adminMenu.render());
            //return ok("ようこそ " + login.name + " さん!!");
        }
    }
}