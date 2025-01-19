package com.example.pokemon_turn_rpg.entity;

import com.example.pokemon_turn_rpg.type.PokemonType;
import com.example.pokemon_turn_rpg.type.SkillType;
import com.example.pokemon_turn_rpg.type.Target;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldNameConstants;

@Entity
@Setter
@Getter
@NoArgsConstructor
@FieldNameConstants
public class Skill {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private Long id;
    private String name;
    private int value;
    @Enumerated( EnumType.STRING )
    private PokemonType pokemonType;
    private String description;
    @Enumerated( EnumType.STRING )
    private SkillType skillType;
    private boolean isActive;
    @Enumerated( EnumType.STRING )
    private Target target;
}
