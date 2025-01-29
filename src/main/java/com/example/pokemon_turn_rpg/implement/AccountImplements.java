package com.example.pokemon_turn_rpg.implement;

import com.example.pokemon_turn_rpg.common.SuccessResponse;
import com.example.pokemon_turn_rpg.controller.AccountController;
import com.example.pokemon_turn_rpg.service.AccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping( "/api/v1/account" )
@RequiredArgsConstructor
public class AccountImplements implements AccountController {
    private AccountService accountService;

    @Override
    public ResponseEntity<SuccessResponse<Void>> registerAccount(String email, String password) {
        return null;
    }

    @Override
    public ResponseEntity<SuccessResponse<Integer>> loginAccount(String email, String password) {
        return null;
    }
}
