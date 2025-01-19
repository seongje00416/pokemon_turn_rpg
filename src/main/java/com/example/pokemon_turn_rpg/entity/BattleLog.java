package com.example.pokemon_turn_rpg.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldNameConstants;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
@FieldNameConstants
public class BattleLog {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private Long id;
    private LocalDateTime battleTime;
    @ManyToOne
    private User user;
    @ManyToOne
    private User opposite;
    private int winnerId;

}
