package com.example.pokemon_turn_rpg.dto.response;

import com.example.pokemon_turn_rpg.entity.Pokemon;
import com.example.pokemon_turn_rpg.entity.SpecialEquipment;
import com.example.pokemon_turn_rpg.type.Stat;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;

@Builder
@Schema( name = "Get User Special Equipment List Response", description = "사용자의 특수 장비 목록 조회 응답" )
public record GetUserSpecialEquipmentResponse(
        @Schema( description = "특수 장비 ID" )
        Long specialEquipmentId,
        @Schema( description = "장착 가능 포켓몬", implementation = Pokemon.class )
        Pokemon pokemonId,
        @Schema( description = "옵션", implementation = Stat.class )
        Stat option,
        @Schema( description = "옵션 수치" )
        Integer value,
        @Schema( description = "특수 장비 설명" )
        String description,
        @Schema( description = "특수 장비 효과" )
        String effect
) {
    public static GetUserSpecialEquipmentResponse of (SpecialEquipment equipment ){
        return GetUserSpecialEquipmentResponse.builder()
                .specialEquipmentId(equipment.getId() )
                .pokemonId( equipment.getPokemon() )
                .option( equipment.getOption() )
                .value( equipment.getValue() )
                .description( equipment.getDescription() )
                .effect( equipment.getEffect() )
                .build();
    }
}
