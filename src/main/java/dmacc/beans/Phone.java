package dmacc.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author booth - gboothroyd@dmacc.edu
 *CIS175 - Fall 2021
 * Oct 18, 2021
 */
@Entity
public class Phone {
	@Id
	@GeneratedValue
	private long id;
	private String name;
	private String color;
	private String operatingSystem;
	public Phone() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param name
	 */
	public Phone(String name) {
		super();
		this.name = name;
	}
	/**
	 * @param name
	 * @param color
	 * @param operatingSystem
	 */
	public Phone(String name, String color, String operatingSystem) {
		super();
		this.name = name;
		this.color = color;
		this.operatingSystem = operatingSystem;
	}
	/**
	 * @param id
	 * @param name
	 * @param color
	 * @param operatingSystem
	 */
	public Phone(long id, String name, String color, String operatingSystem) {
		super();
		this.id = id;
		this.name = name;
		this.color = color;
		this.operatingSystem = operatingSystem;
	}
	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}
	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}
	/**
	 * @return the operatingSystem
	 */
	public String getOperatingSystem() {
		return operatingSystem;
	}
	/**
	 * @param operatingSystem the operatingSystem to set
	 */
	public void setOperatingSystem(String operatingSystem) {
		this.operatingSystem = operatingSystem;
	}
	@Override
	public String toString() {
		return "Phone [id=" + id + ", name=" + name + ", color=" + color + ", operatingSystem=" + operatingSystem + "]";
	}
	
	

}
