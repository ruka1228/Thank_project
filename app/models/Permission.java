package models;

import play.db.ebean.Model;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Permission extends Model {
	@OneToMany
	public List<User> users;
	@Id//←ここでIDを主キーに設定している
    public Integer permission_id; //権限ID

    public String permission_name; //権限名
}
