package com.example.pokemon_turn_rpg.dto.request;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema( name = "Change Normal Equipment Request", description = "기본 장비 변경 요청")
public record ChangeNormalEquipmentRequest(
        @Schema( description = "사용자 포켓몬 ID" )
        Long userPokemonId,
        @Schema( description = "기존 장착 아이템 ID" )
        Long beforeEquipmentId,
        @Schema( description = "신규 장착 아이템 ID" )
        Long afterEquipmentId
) {
}
