package models;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

import play.db.ebean.Model;

@Entity
public class Thankyou extends Model {
	@Id
    public Integer thankyou_id;

	public Date date;

    public String section_id;

    public String you_name;

    public String employee_number;

    public Integer vote_number;

    public String help_contents;

    public Integer check_id;
}