package com.example.day;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Train")
public class ticket {
	@Id
	private int Trainid;
	private String Trainname;
	private String Trainloc;
	public int getTrainid() {
		return Trainid;
	}
	public void setTrainid(int trainid) {
		Trainid = trainid;
	}
	public String getTrainname() {
		return Trainname;
	}
	public void setTrainname(String trainname) {
		Trainname = trainname;
	}
	public String getTrainloc() {
		return Trainloc;
	}
	public void setTrainloc(String trainloc) {
		Trainloc = trainloc;
	}
	

}
