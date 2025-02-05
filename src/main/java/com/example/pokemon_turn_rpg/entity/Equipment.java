package com.example.pokemon_turn_rpg.entity;

import com.example.pokemon_turn_rpg.type.NormalEquipment;
import com.example.pokemon_turn_rpg.type.Stat;
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
public class Equipment {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private Long id;
    @Enumerated( EnumType.STRING )
    private NormalEquipment equipment;
    @Enumerated( EnumType.STRING )
    private Stat mainStat;
    private int mainValue;
    @Enumerated( EnumType.STRING )
    private Stat subStat;
    private int subValue;
    private Long wornPokemonId;

    public void update( Long wornPokemonId ){
        this.wornPokemonId = wornPokemonId;
    }
}
