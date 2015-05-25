package models;

import play.db.ebean.Model;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Section extends Model {
	@Id//←ここでIDを主キーに設定している
    public Integer section_id;

    public String section_name;
}