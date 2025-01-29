package com.example.pokemon_turn_rpg.service;

import com.example.pokemon_turn_rpg.repository.MoneyRepository;
import com.example.pokemon_turn_rpg.repository.UserPokemonRepository;
import com.example.pokemon_turn_rpg.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {
    private UserRepository userRepository;
    private UserPokemonRepository userPokemonRepository;
    private MoneyRepository moneyRepository;
}
