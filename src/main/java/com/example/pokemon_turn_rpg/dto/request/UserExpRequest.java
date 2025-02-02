package com.example.pokemon_turn_rpg.dto.request;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema( name = "User Exp Request", description = "사용자 경험치 조절 요청")
public record UserExpRequest(
        @Schema( description = "사용자 ID" )
        Long userId,
        @Schema( description = "올라가는 경험치 량" )
        Integer increaseExp,
        @Schema( description = "현재 경험치" )
        Integer currentExp,
        @Schema( description = "현재 레벨" )
        Integer level
) {
}
