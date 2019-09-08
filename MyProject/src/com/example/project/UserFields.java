package com.example.project;

public class UserFields {
       String name;
       String password;
       long contact;
       String email;
	
       public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public long getContact() {
		return contact;
	}
	public void setContact(long contact) {
		this.contact = contact;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "UserFields [name=" + name + ", password=" + password + ", contact=" + contact + ", email=" + email
				+ "]";
	}
	
       
	
       
}
