package com.example.pokemon_turn_rpg.dto.response;

import com.example.pokemon_turn_rpg.entity.Equipment;
import com.example.pokemon_turn_rpg.type.NormalEquipment;
import com.example.pokemon_turn_rpg.type.Stat;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;

@Builder
@Schema( name = "Get User's Normal Equipment Response", description = "사용자의 일반 장비 목록 조회 응답")
public record GetUserNormalEquipmentResponse(
        @Schema( description = "장비 ID" )
        Long equipmentId,
        @Schema( description = "장비 이름", implementation = NormalEquipment.class )
        NormalEquipment equipment,
        @Schema( description = "주 옵션", implementation = Stat.class )
        Stat mainOption,
        @Schema( description = "주 옵션 값" )
        Integer mainValue,
        @Schema( description = "보조 옵션", implementation = Stat.class )
        Stat subOption,
        @Schema( description = "보조 옵션 값" )
        Integer subValue
) {
    public static GetUserNormalEquipmentResponse of ( Equipment equipment ){
        return GetUserNormalEquipmentResponse.builder()
                .equipmentId( equipment.getId() )
                .equipment( equipment.getEquipment() )
                .mainOption( equipment.getMainStat() )
                .mainValue( equipment.getMainValue() )
                .subOption( equipment.getSubStat() )
                .subValue( equipment.getSubValue() )
                .build();
    }
}
