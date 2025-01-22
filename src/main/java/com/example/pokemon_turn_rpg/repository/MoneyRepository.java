package com.example.pokemon_turn_rpg.repository;

import com.example.pokemon_turn_rpg.entity.Money;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MoneyRepository extends JpaRepository<Money, Long > {
}
