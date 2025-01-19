package com.example.pokemon_turn_rpg.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldNameConstants;

import java.time.LocalDateTime;

@Entity
@Setter
@Getter
@NoArgsConstructor
@FieldNameConstants
public class UserPokemon {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private Long id;
    @OneToOne
    private User user;
    @ManyToOne
    private Pokemon pokemon;
    private int level;
    private LocalDateTime obtainTime;
}
