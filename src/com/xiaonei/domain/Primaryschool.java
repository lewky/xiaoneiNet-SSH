package com.xiaonei.domain;

// Generated 2017-8-23 21:07:11 by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;

/**
 * Primaryschool generated by hbm2java
 */
public class Primaryschool implements java.io.Serializable {

	private Integer id;
	private Town town;
	private City city;
	private String name;
	private Set userses = new HashSet(0);

	public Primaryschool() {
	}

	public Primaryschool(String name) {
		this.name = name;
	}

	public Primaryschool(Town town, City city, String name, Set userses) {
		this.town = town;
		this.city = city;
		this.name = name;
		this.userses = userses;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Town getTown() {
		return this.town;
	}

	public void setTown(Town town) {
		this.town = town;
	}

	public City getCity() {
		return this.city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set getUserses() {
		return this.userses;
	}

	public void setUserses(Set userses) {
		this.userses = userses;
	}

}
