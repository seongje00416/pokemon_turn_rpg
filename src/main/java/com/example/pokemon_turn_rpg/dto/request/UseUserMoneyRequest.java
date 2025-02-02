package com.example.pokemon_turn_rpg.dto.request;

import com.example.pokemon_turn_rpg.type.Money;
import io.swagger.v3.oas.annotations.media.Schema;

@Schema( name = "Use User Money Request", description = "사용자 재화 사용 요청" )
public record UseUserMoneyRequest(
        @Schema( description = "사용자 ID" )
        Long userId,
        @Schema( description = "사용 재화", implementation = Money.class )
        Money money,
        @Schema( description = "사용 재화량" )
        Integer amount
) {
}
