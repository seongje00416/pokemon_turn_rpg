package com.example.pokemon_turn_rpg.entity;

import com.example.pokemon_turn_rpg.type.PokemonType;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldNameConstants;

@Entity
@Getter
@Setter
@NoArgsConstructor
@FieldNameConstants
public class Pokemon {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private Long id;
    private String name;
    @Enumerated( EnumType.STRING )
    private PokemonType pokemonType;
    private int attack;
    private int defense;
    private int specialAttack;
    private int specialDefense;
    private int speed;
    private int accuracy;
    private int avoidance;
    private int hp;
}
