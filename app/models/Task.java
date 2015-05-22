
package models;

import javax.persistence.Entity;
import javax.persistence.Id;

import play.db.ebean.Model;

/**
 * @author User
 *
 */
@Entity
public class Task extends Model {
	@Id
	       public Integer id;

	       public String name;

}