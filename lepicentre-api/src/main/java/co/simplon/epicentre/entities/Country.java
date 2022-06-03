package co.simplon.epicentre.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "countries")
public class Country {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "picture")
    private String picture;

    @OneToMany(mappedBy = "country", cascade = CascadeType.ALL)
    private List<Product> products;

    public Country() {

    }

    public Country(Long id, String name, String picture, List<Product> products) {
	super();
	this.id = id;
	this.name = name;
	this.picture = picture;
	this.products = products;
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

    public String getPicture() {
	return picture;
    }

    public void setPicture(String picture) {
	this.picture = picture;
    }

    @Override
    public String toString() {
	return String.format(
		"Country [id=%s, name=%s, picture=%s, getId()=%s, getName()=%s, getPicture()=%s, getClass()=%s, hashCode()=%s, toString()=%s]",
		id, name, picture, getId(), getName(), getPicture(), getClass(), hashCode(), super.toString());
    }

}
