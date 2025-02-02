package com.example.pokemon_turn_rpg.dto.response;

import com.example.pokemon_turn_rpg.entity.Equipment;
import com.example.pokemon_turn_rpg.entity.HoldItem;
import com.example.pokemon_turn_rpg.entity.SpecialEquipment;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;

@Builder
@Schema( name = "Get Equipment worn Pokemon Response", description = "포켓몬 착용 장비 조회 응답")
public record GetWearEquipmentResponse(
        @Schema( description = "사용자 포켓몬 ID" )
        Long userPokemonId,
        @Schema( description = "일반 장비 1번")
        Long normalEquipmentId1,
        @Schema( description = "일반 장비 2번")
        Long normalEquipmentId2,
        @Schema( description = "일반 장비 3번")
        Long normalEquipmentId3,
        @Schema( description = "일반 장비 4번")
        Long normalEquipmentId4,
        @Schema( description = "특수 장비")
        Long specialEquipmentId,
        @Schema( description = "지니는 도구")
        Long holdItemId
) {
    public static GetWearEquipmentResponse of (
            Equipment normalEquipment1,
            Equipment normalEquipment2,
            Equipment normalEquipment3,
            Equipment normalEquipment4,
            SpecialEquipment specialEquipment,
            HoldItem holdItem
    ) {
        return GetWearEquipmentResponse.builder()
                .normalEquipmentId1( normalEquipment1.getId() )
                .normalEquipmentId2( normalEquipment2.getId() )
                .normalEquipmentId3( normalEquipment3.getId() )
                .normalEquipmentId4( normalEquipment4.getId() )
                .specialEquipmentId( specialEquipment.getId() )
                .holdItemId( holdItem.getId() )
                .build();
    }
}
