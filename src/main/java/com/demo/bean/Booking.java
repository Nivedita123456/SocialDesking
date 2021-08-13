package com.demo.bean;



import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Booking {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
@Column(name="bookingid")
private int id;

@Column(name="status")
private String deskstatus;

@Column(name="startdate")
@Temporal(TemporalType.DATE)
private Date startdate;

@Column(name="enddate")
@Temporal(TemporalType.DATE)
private Date enddate;

@ManyToOne
@JoinColumn(name="floorid")
private Floor floor; //Foreign key*/

@ManyToOne
@JoinColumn(name="chairid")
private Chair chair; //Foreign key*/

@ManyToOne
@JoinColumn(name="empid")
private Employee employee; //Foreign key*/

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getDeskstatus() {
	return deskstatus;
}

public void setDeskstatus(String deskstatus) {
	this.deskstatus = deskstatus;
}

public Date getStartdate() {
	return startdate;
}

public void setStartdate(Date startdate) {
	this.startdate = startdate;
}

public int getEnddate() {
	return enddate;
}

public void setEnddate(int enddate) {
	this.enddate = enddate;
}

public Floor getFloor() {
	return floor;
}

public void setFloor(Floor floor) {
	this.floor = floor;
}

public Chair getChair() {
	return chair;
}

public void setChair(Chair chair) {
	this.chair = chair;
}

public Employee getEmployee() {
	return employee;
}

public void setEmployee(Employee employee) {
	this.employee = employee;
}
public Booking() {
	
}
public Booking(int id, String deskstatus, Date startdate, int enddate, Floor floor, Chair chair, Employee employee) {
	super();
	this.id = id;
	this.deskstatus = deskstatus;
	this.startdate = startdate;
	this.enddate = enddate;
	this.floor = floor;
	this.chair = chair;
	this.employee = employee;
}



}
