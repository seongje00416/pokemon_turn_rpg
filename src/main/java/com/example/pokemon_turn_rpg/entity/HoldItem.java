package com.example.pokemon_turn_rpg.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldNameConstants;

@Entity
@Setter
@Getter
@NoArgsConstructor
@FieldNameConstants
public class HoldItem {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private Long id;
    private String name;
    private String description;
    private String effect;
    private Long wornPokemonId;

    public void update( Long wornPokemonId ){
        this.wornPokemonId = wornPokemonId;
    }
}
