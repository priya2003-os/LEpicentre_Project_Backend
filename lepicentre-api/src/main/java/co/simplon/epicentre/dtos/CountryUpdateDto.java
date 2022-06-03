package co.simplon.epicentre.dtos;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class CountryUpdateDto {

    @NotNull
    @NotBlank
    String name;

    @NotNull
    @NotBlank
    String picture;

}
