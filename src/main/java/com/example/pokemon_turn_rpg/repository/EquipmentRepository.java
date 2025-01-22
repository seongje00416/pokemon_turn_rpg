package com.example.pokemon_turn_rpg.repository;

import com.example.pokemon_turn_rpg.entity.Equipment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EquipmentRepository extends JpaRepository<Equipment, Long > {
}
