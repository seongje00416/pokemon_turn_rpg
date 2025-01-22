package com.example.pokemon_turn_rpg.repository;

import com.example.pokemon_turn_rpg.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long > {
}
