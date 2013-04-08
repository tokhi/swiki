package models;

import javax.persistence.Entity;
import javax.persistence.Id;

import play.data.validation.Constraints.Required;
import play.db.ebean.Model;

@Entity
public class Article extends Model{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	public Long id;
	@Required
	public String title;
	@Required
	public String description;

}
