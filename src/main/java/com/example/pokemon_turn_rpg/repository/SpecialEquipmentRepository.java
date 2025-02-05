package com.example.pokemon_turn_rpg.repository;

import com.example.pokemon_turn_rpg.entity.SpecialEquipment;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SpecialEquipmentRepository extends JpaRepository<SpecialEquipment, Long> {
    Optional<SpecialEquipment> findAllByWornPokemonId(Long wornPokemonId);
}
