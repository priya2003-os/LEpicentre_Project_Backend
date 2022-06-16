package co.simplon.epicentre.entities;

import co.simplon.epicentre.dtos.ProductCreateDto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "picture")
    private String picture;

    @Column(name = "price")
    private String price;

    @ManyToOne
    @JoinColumn(name = "country_id")
    private Country country;

    @ManyToOne
    @JoinColumn(name = "brand_id")
    private Brand brand;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    public Product() {

    }

    public Long getId() {
	return id;
    }

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public String getDescription() {
	return description;
    }

    public void setDescription(String description) {
	this.description = description;
    }

    public String getPicture() {
	return picture;
    }

    public void setPicture(String picture) {
	this.picture = picture;
    }

    public String getPrice() {
	return price;
    }

    public void setPrice(String price) {
	this.price = price;
    }

    public Country getCountry() {
	return country;
    }

    public void setCountry(Country country) {
	this.country = country;
    }

    public Brand getBrand() {
	return brand;
    }

    public void setBrand(Brand brand) {
	this.brand = brand;
    }

    public Category getCategory() {
	return category;
    }

    public void setCategory(ProductCreateDto category) {
	this.category = category;
    }

    @Override
    public String toString() {
	return String.format(
		"ProductByCountry [id=%s, name=%s, description=%s, picture=%s, price=%s, country=%s, brand=%s, category=%s, getId()=%s, getName()=%s, getDescription()=%s, getPicture()=%s, getPrice()=%s, getCountry()=%s, getBrand()=%s, getCategory()=%s, getClass()=%s, hashCode()=%s, toString()=%s]",
		id, name, description, picture, price, country, brand, category, getId(), getName(), getDescription(),
		getPicture(), getPrice(), getCountry(), getBrand(), getCategory(), getClass(), hashCode(),
		super.toString());
    }

}
