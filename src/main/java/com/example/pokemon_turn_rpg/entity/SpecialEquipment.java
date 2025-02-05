package com.example.pokemon_turn_rpg.entity;

import com.example.pokemon_turn_rpg.type.Stat;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldNameConstants;

@Entity
@Getter
@Setter
@FieldNameConstants
@NoArgsConstructor
public class SpecialEquipment {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private Long id;
    @ManyToOne
    private Pokemon pokemon;
    private Stat option;
    private int value;
    private String description;
    private String effect;
    private Long wornPokemonId;
    private Long userId;

    public void update( Long wornPokemonId ){
        this.wornPokemonId = wornPokemonId;
    }

}
