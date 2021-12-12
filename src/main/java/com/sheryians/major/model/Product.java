package com.sheryians.major.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;

@Entity
@Data
public class Product {

	@javax.persistence.Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String name;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "category_id", referencedColumnName = "category_id")
	private Category category;

	private double price;
	private double weight;
	private String description;
	private String imgName;

	public Product(Long id, String name, Category category, double price, double weight, String description,
			String imageName) {
		super();
		this.id = id;
		this.name = name;
		this.category = category;
		this.price = price;
		this.weight = weight;
		this.description = description;
		this.imgName = imageName;
	}

	public Product(String name, Category category, double price, double weight, String description, String imageName) {
		super();
		this.name = name;
		this.category = category;
		this.price = price;
		this.weight = weight;
		this.description = description;
		this.imgName = imageName;
	}

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImageName() {
		return imgName;
	}

	public void setImageName(String imageName) {
		this.imgName = imageName;
	}

	@Override
	public String toString() {
		return "Product [Id=" + id + ", name=" + name + ", category=" + category + ", price=" + price + ", weight="
				+ weight + ", description=" + description + ", imageName=" + imgName + "]";
	}

}
