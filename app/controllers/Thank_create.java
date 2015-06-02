package controllers;

import java.util.List;

import models.Thankyou;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.*;
import java.util.Date;

public class Thank_create extends Controller {
    public static Form<Thankyou> thankyouForm = Form.form(Thankyou.class);

    //listの表示
    public static Result thanksEntry() {
        List<Thankyou> thankyouList = Thankyou.find.all();
        return ok(thanksEntry.render(thankyouList,thankyouForm));
    }

    //フォームで入力した情報をDBに保存
    public static Result createThank() {
        Form<Thankyou> form = thankyouForm.bindFromRequest();

        if (form.hasErrors()) {
            List<Thankyou> thankyouList = Thankyou.find.all();

            // 制約エラーが発生したら、その情報を持つ form を渡してあげる
            return badRequest(thanksEntry.render(thankyouList, form));
        } else {
        	Thankyou newThankyou = form.get();
        	newThankyou.date = new Date();
            newThankyou.save();
            return redirect(routes.Thank_create.createThank());
        }
    }
}