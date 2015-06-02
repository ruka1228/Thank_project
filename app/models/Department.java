
package models;

import play.db.ebean.Model;
import javax.persistence.*;
import views.html.*;

@Entity
public class Department extends Model {
	@Id//←ここでIDを主キーに設定している
    public Integer department_id; //部署ID

    public String department_name; //部署名

    public static Finder<Integer, Department> find = new Finder<Integer,Department>(
    		Integer.class, Department.class
        );
}
