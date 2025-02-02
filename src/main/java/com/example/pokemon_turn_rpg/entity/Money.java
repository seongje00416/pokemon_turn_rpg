package com.example.pokemon_turn_rpg.entity;

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
public class Money {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private Long id;
    @OneToOne
    private User user;
    private int pokeBall;
    private int greatBall;
    private int ultraBall;
    private int whiteFlute;
    private int gold;
}
