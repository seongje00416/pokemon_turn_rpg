package com.example.pokemon_turn_rpg.repository;

import com.example.pokemon_turn_rpg.entity.Equipment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface EquipmentRepository extends JpaRepository<Equipment, Long > {
    List<Equipment> findAllByWornPokemonId(Long wornPokemonId );
}
