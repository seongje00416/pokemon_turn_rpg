package com.example.pokemon_turn_rpg.common.exception;

import java.io.Serializable;

public interface ErrorCode extends Serializable {
    int getStatus();

    String getCode();

    String getMessage();
}
