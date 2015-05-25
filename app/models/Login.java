package models;

import javax.persistence.Entity;
import javax.persistence.Id;

import play.db.ebean.Model;

@Entity
public class Login extends Model {
	@Id
    public Integer employee_number;

	public Integer user_number;

    public String password;

    public Integer permission_id;
}