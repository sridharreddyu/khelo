package com.i2i.khelo.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Entity implementation class for Entity: User
 *
 */
@Entity
@Table(name="Users", 
uniqueConstraints={@UniqueConstraint(columnNames={"userId"})})
@XmlRootElement
public class User implements Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="userId", nullable=false, unique=true, length=11)
	private int userId;
	
	@Column(name="loginName", length=100, nullable=false, unique=true)
	private String loginName;
	
	@Column(name="password", length=100, nullable=false)
	private String password;
	
	@Column(name="userName", length=100, nullable=false)
	private String userName;
	
	@Column(name="mobileNumber", length=20, nullable=true)
	private long mobileNumber;
	private static final long serialVersionUID = 1L;

	public User() {
		super();
	}  
	
	public User(String loginName, String password, String userName,
			long mobileNumber) {
		super();
		this.loginName = loginName;
		this.password = password;
		this.userName = userName;
		this.mobileNumber = mobileNumber;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}   
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}   
	public long getMobileNumber() {
		return this.mobileNumber;
	}

	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getLoginName() {
		return loginName;
	}
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
   
}
