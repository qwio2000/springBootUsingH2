package demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Friends {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String userId;
	private String name;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public Friends() {
		// TODO Auto-generated constructor stub
	}
	
	public Friends(String userId, String name) {
		this.userId = userId;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Friends [id=" + id + ", userId=" + userId + ", name=" + name
				+ "]";
	}

}
