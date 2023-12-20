package com.Employ.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Employee {
	 
     @Id
     private String Id;
     
     @Column(name = "EmployeeName")
     private String name;
     
     @Column(name= "EmployeePhoneNumber")
     private int phoneNumber;
     
     @Column(name="EmployeeEmail")
     private String email;
     
     @Column(name = "ImageURL")
     private String imageURL;
     
     @Column(name = "ReportTO")
     private String reportTO;

	 public String getId() {
		return Id;
	 }

	 public void setId(String id) {
		Id = id;
	 }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getImageURL() {
		return imageURL;
	}

	public void setImageURL(String imageURL) {
		this.imageURL = imageURL;
	}

	public String getReportTO() {
		return reportTO;
	}

	public void setReportTO(String reportTO) {
		this.reportTO = reportTO;
	}
     
	 
     
     
}
