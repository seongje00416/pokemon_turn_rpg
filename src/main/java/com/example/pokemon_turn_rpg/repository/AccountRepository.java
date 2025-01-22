package com.example.pokemon_turn_rpg.repository;

import com.example.pokemon_turn_rpg.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository< Account, Long > {
}
