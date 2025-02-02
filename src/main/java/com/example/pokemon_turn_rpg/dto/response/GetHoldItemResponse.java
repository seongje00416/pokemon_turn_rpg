package com.example.pokemon_turn_rpg.dto.response;

import com.example.pokemon_turn_rpg.entity.HoldItem;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;

@Builder
@Schema( name = "Get Hold Item Response", description = "지니는 도구 목록 조회 응답" )
public record GetHoldItemResponse(
        @Schema( description = "도구 ID" )
        Long holdItemId,
        @Schema( description = "도구 이름" )
        String name,
        @Schema( description = "도구 설명" )
        String description,
        @Schema( description = "도구 효과" )
        String effect
) {
    public static GetHoldItemResponse of ( HoldItem holdItem ){
        return GetHoldItemResponse.builder()
                .holdItemId(holdItem.getId() )
                .name( holdItem.getName() )
                .description( holdItem.getDescription() )
                .effect( holdItem.getEffect() )
                .build();
    }
}
