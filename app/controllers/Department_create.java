package controllers;

import java.util.List;

import models.Department;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.*;

public class Department_create extends Controller {
    public static Form<Department> departmentForm = Form.form(Department.class);

    //listの表示
    public static Result addPost() {
        List<Department> departmentList = Department.find.all();
        return ok(addPost.render(departmentList,departmentForm));
    }

    //フォームで入力した情報をDBに保存
    public static Result createDepartment() {
        Form<Department> form = departmentForm.bindFromRequest();

        if (form.hasErrors()) {
            List<Department> departmentList = Department.find.all();

            // 制約エラーが発生したら、その情報を持つ form を渡してあげる
            return badRequest(addPost.render(departmentList, form));
        } else {
        	Department newDepartment = form.get();
            newDepartment.save();
            return redirect(routes.Department_create.addPost());
        }
    }
}