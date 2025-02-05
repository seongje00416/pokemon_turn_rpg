package com.example.pokemon_turn_rpg.repository;

import com.example.pokemon_turn_rpg.entity.HoldItem;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface HoldItemRepository extends JpaRepository<HoldItem, Long> {
    Optional<HoldItem> findAllByWornPokemonId(Long wornPokemonId );
}
