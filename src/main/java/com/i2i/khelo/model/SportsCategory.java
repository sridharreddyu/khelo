package com.i2i.khelo.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Entity implementation class for Entity: SportsCategory
 *
 */
@Entity
@Table(name = "SportsCategory")
public class SportsCategory implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "sportsCategoryId", nullable = false, unique = true, length = 11)
	private int sportsCategoryId;
	
	@Column(name = "sportName", length = 100, nullable = false, unique = true)
	private String sportName;
	
	@Column(name = "numberOfPlayers", length = 3, nullable = true, unique = false)
	private int numberOfPlayers;
	
	private static final long serialVersionUID = 1L;

	public SportsCategory() {
		}

	public int getSportsCategory() {
		return this.sportsCategoryId;
	}

	public void setSportsCategory(int SportsCategory) {
		this.sportsCategoryId = SportsCategory;
	}

	public String getSportName() {
		return this.sportName;
	}

	public void setSportName(String sportName) {
		this.sportName = sportName;
	}

	public int getNumberofplayers() {
		return this.numberOfPlayers;
	}

	public void setNumberofplayers(int numberofplayers) {
		this.numberOfPlayers = numberofplayers;
	}

}
