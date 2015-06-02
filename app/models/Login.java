package models;

import javax.persistence.Entity;
import javax.persistence.Id;

import play.db.ebean.Model;

@Entity
public class Login extends Model {

	@Id
    public Integer id; //ログインID

    public String password; //パスワード

    public Integer employee_id;//社員ID
}