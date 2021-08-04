package com.example.springassignment1;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class customer {
	//@Autowired
	Address a;

	/*public Address getA() {
		return a;
	}

	public void setA(Address a) {
		this.a = a;
	}*/
	
	int cuctId =101;
	String cname="karthik";
	String contact="9955995599";
	
	public customer(int cuctId, String cname, String contact,Address a) {
		super();
		this.cuctId = cuctId;
		this.cname = cname;
		this.contact = contact;
		this.a=a;
		
		
	}
	customer(Address a){
		this.a=a;
		
	}

	customer()
	{
		
	}
	
	public int getCuctId() {
		return cuctId;
	}

	public void setCuctId(int cuctId) {
		this.cuctId = cuctId;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	@Override
	public String toString() {
		return "customer [cuctId=" + cuctId + ", cname=" + cname + ", contact=" + contact +  ", address="+a+"]";
	} 

	
	
	
	

}
