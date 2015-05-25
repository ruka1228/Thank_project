package models;

import play.db.ebean.Model;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Permission extends Model {
	@Id//←ここでIDを主キーに設定している
    public Integer permission_id;

    public String permission_name;
}