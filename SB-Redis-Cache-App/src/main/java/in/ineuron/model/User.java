package in.ineuron.model;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private String id;
	private String name;
	private Long salary;
	
	
	public  User() {
		
	}
	public User(String id, String name, Long salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}



	public String getId() {
		return id;
	}



	public void setId(String id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public Long getSalary() {
		return salary;
	}



	public void setSalary(Long salary) {
		this.salary = salary;
	}



	public static long getSerialversionuid() {
		return serialVersionUID;
	}



	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
	
	

}
