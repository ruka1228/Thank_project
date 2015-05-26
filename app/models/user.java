package models;

import play.db.ebean.Model;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class user extends Model {
	@Id//←ここでIDを主キーに設定している
    public Integer empoyee_id;//社員ID

    public String name;//社員の名前

    public Integer permission_id;//権限

    public Integer vote_id;//投票の持ち点
}
