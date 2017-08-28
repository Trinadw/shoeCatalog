package com.shoe.shoeCatalog;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;

@Entity
public class ShoeType {

	@Id
	@GeneratedValue
	private long id;
	
	@ManyToOne
	private Shoe shoe;

	public String shoeCatagory;

	public String imageUrl;

	@Lob
	public String description;

	@Lob
	public String likes;

	@Lob
	public String dislikes;

	// getters
	public long getId() {
		return id;
	}

	public String getShoeCatagory() {
		return shoeCatagory;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public String getDescription() {
		return description;
	}

	public String getLikes() {
		return likes;
	}

	public String getDislikes() {
		return dislikes;
	}

	public ShoeType(String shoeCatagory, String imageUrl, String description, String likes, String dislikes) {
		this.shoeCatagory = shoeCatagory;
		this.imageUrl = imageUrl;
		this.description = description;
		this.likes = likes;
		this.dislikes = dislikes;
	}
	
	public ShoeType () {
			}

}
