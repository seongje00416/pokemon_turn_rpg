package com.example.pokemon_turn_rpg.repository;

import com.example.pokemon_turn_rpg.entity.UserPokemon;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserPokemonRepository extends JpaRepository<UserPokemon, Long> {
}
