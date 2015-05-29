package models;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

import play.db.ebean.Model;

@Entity
public class Thankyou extends Model {

	@ManyToOne
	public List<User> user;

	@ManyToOne
	public List<Section> section;

	@ManyToOne
	public List<Depertment> post;

	@Id
    public Integer thankyou_id; //感謝カードID

	public Date date; //日付

    public String section_id; //種別ID

    public String you_name; //相手の氏名

    public String employee_number; //社員ID

    public Integer post_id; //部署ID

    public Integer vote_number; //投票数

    public String help_contents; //ヘルプ内容

    public Integer check_id; //チェック判定
}
