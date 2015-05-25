
package models;

import play.db.ebean.Model;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Depertment extends Model {
	@Id//←ここでIDを主キーに設定している
    public Integer department_id;

    public String department_name;

}
