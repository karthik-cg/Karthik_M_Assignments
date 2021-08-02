package springcorecollections;

import java.util.List;

public class quesList {
	private String name;
	
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public List<String> getPhones() {
		return phones;
	}
	
	public void setPhones(List<String> phones) {
		this.phones = phones;
	}
	
	private List<String> phones;
	
	public quesList(String name, List<String> phones) {
		super();
		this.name = name;
		this.phones = phones;
	}

	public quesList() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
