package com.example.pokemon_turn_rpg.service;

import com.example.pokemon_turn_rpg.repository.AccountRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AccountService {
    private AccountRepository accountRepository;
}
