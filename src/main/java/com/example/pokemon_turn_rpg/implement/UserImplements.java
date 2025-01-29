package com.example.pokemon_turn_rpg.implement;

import com.example.pokemon_turn_rpg.controller.UserController;
import com.example.pokemon_turn_rpg.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping( "/api/v1/user" )
@RestController
@RequiredArgsConstructor
public class UserImplements implements UserController {
    private UserService userService;

}
