package co.simplon.epicentre.dtos;

public class CountryCreateDto {

    private Long id;

    private String name;

    private String picture;

    public CountryCreateDto() {

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
	return String.format("CountryCreateDto [name=%s, picture=%s]", name, picture);
    }

}
