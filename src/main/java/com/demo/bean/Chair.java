package com.demo.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Chair {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
@Column(name="chairid")
private String id;

@Column(name="Coordinate_X")
private int cordx;

@Column(name="Corrdinate_Y")
private int cordy;

@Column(name="rotation")
private int rotation;

@ManyToOne
@JoinColumn(name="floorid")
private Floor floor; //Foreign key*/
@ManyToOne
@JoinColumn(name="offid")
private Office office; //Foreign key*/
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public int getCordx() {
	return cordx;
}
public void setCordx(int cordx) {
	this.cordx = cordx;
}
public int getCordy() {
	return cordy;
}
public void setCordy(int cordy) {
	this.cordy = cordy;
}
public int getRotation() {
	return rotation;
}
public void setRotation(int rotation) {
	this.rotation = rotation;
}
public Floor getFloor() {
	return floor;
}
public void setFloor(Floor floor) {
	this.floor = floor;
}
public Office getOffice() {
	return office;
}
public void setOffice(Office office) {
	this.office = office;
}
public Chair() {
	
}
public Chair(String id, int cordx, int cordy, int rotation, Floor floor, Office office) {
	super();
	this.id = id;
	this.cordx = cordx;
	this.cordy = cordy;
	this.rotation = rotation;
	this.floor = floor;
	this.office = office;
}
}
