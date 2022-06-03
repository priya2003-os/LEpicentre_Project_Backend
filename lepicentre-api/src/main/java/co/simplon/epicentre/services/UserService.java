package co.simplon.epicentre.services;

import co.simplon.epicentre.dtos.UserCreateDto;
import co.simplon.epicentre.dtos.UserSignInDto;
import co.simplon.epicentre.security.Jwt;

public interface UserService {

    void create(UserCreateDto inputs);

    Jwt signIn(UserSignInDto inputs);
}
