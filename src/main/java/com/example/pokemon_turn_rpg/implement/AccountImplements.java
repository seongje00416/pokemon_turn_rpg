package com.example.pokemon_turn_rpg.implement;

import com.example.pokemon_turn_rpg.controller.AccountController;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping( "/api/v1/account" )
@RequiredArgsConstructor
public class AccountImplements implements AccountController {

}
