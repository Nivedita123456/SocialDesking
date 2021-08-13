package com.demo.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
@Column(name="empid")
private int id;

@Column(name="empname")
private String empname;



@Column(name="empemail")
private String email;

@Column(name="teamid")
private String teamid;

public String getTeamid() {
	return teamid;
}

public void setTeamid(String teamid) {
	this.teamid = teamid;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getEmpname() {
	return empname;
}

public void setEmpname(String empname) {
	this.empname = empname;
}



public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}
public Employee() {
	
}
public Employee(int id, String empname, String email,String teamid) {
	super();
	this.id = id;
	this.empname = empname;
	this.email = email;
	this.teamid=teamid;
}

}
