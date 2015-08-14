package models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

import com.avaje.ebean.Model;
import com.avaje.ebean.Model.Finder;

import play.twirl.api.Html;

@Entity
public class Wish extends Model{
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	public long id;
	
	@NotNull
	public String title;
	
	@Column(columnDefinition = "TEXT")
	public String content;
	
	public boolean isPublic;
	
	public boolean isMark;
	
	public boolean hasPassword;
	
	@ManyToOne
	public User creator;
	
	@ManyToMany
	public List<User> viewable;
	
	public String password;
	
	public String imgLink;
	
	public static Finder<Long, Wish> find = new Finder<>(Wish.class);
}
