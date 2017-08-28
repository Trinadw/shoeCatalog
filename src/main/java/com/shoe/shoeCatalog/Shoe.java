package com.shoe.shoeCatalog;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Shoe {

	@Id
	@GeneratedValue
	private long id;
	
	@OneToMany(mappedBy="shoe")
	private Set<ShoeType> shoeTypes;
	
	public Set<ShoeType> getShoeTypes() {
		return shoeTypes;
	}

	public String shoeType;

	//getters
	public String getShoeType() {
		return shoeType;
	}
	
	public long getId() {
		return id;
	}

	//constructors
	public Shoe(String shoeType) {
				this.shoeType = shoeType;
	}
	 
	private Shoe() {
		
	}
}
