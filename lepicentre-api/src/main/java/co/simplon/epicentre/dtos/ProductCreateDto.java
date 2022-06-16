package co.simplon.epicentre.dtos;

import co.simplon.epicentre.entities.Brand;
import co.simplon.epicentre.entities.Category;
import co.simplon.epicentre.entities.Country;

public class ProductCreateDto {

    private Long id;

    private  String name;

    private String description;

    private String picture;

    private String price;

    private Country country;

    private Category category;

    private Brand brand;

    public ProductCreateDto() {
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

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "ProductCreateDto{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", picture='" + picture + '\'' +
                ", price='" + price + '\'' +
                ", country=" + country +
                ", category=" + category +
                ", brand=" + brand +
                '}';
    }
}


