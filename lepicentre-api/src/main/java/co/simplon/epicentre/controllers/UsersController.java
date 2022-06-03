package co.simplon.epicentre.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import co.simplon.epicentre.dtos.UserCreateDto;
import co.simplon.epicentre.dtos.UserSignInDto;
import co.simplon.epicentre.security.Jwt;
import co.simplon.epicentre.services.UserService;

@RestController
@RequestMapping("/users") // minuscule au pluriel car plusieurrs users
public class UsersController {

    private final UserService service;

    public UsersController(UserService service) {
	this.service = service;
    }

    @PostMapping("/signup")
    @ResponseStatus(HttpStatus.CREATED)
    public void create(@RequestBody UserCreateDto inputs) {
	System.out.println(inputs);
	service.create(inputs);
    }

    @PostMapping("/login")
    public Jwt SignIn(@RequestBody UserSignInDto inputs) {// creation de la classe UserLogin
	return service.signIn(inputs);
    }

}
