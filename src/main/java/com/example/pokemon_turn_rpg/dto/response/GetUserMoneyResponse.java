package com.example.pokemon_turn_rpg.dto.response;

import com.example.pokemon_turn_rpg.entity.Money;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;

@Builder
@Schema( name = "Get User Money Response", description = "사용자 보유 재화 조회 응답" )
public record GetUserMoneyResponse(
        @Schema( description = "사용자 ID" )
        Long userId,
        @Schema( description = "몬스터볼 개수" )
        int pokeBall,
        @Schema( description = "수퍼볼 개수" )
        int greatBall,
        @Schema( description = "하이퍼볼 개수" )
        int ultraBall,
        @Schema( description = "하양비드로 개수" )
        int whiteFlute,
        @Schema( description = "보유 골드" )
        int gold
) {
    public static GetUserMoneyResponse of ( Money money ){
        return GetUserMoneyResponse.builder()
                .userId( money.getUser().getId() )
                .pokeBall( money.getPokeBall() )
                .greatBall( money.getGreatBall() )
                .ultraBall( money.getUltraBall() )
                .whiteFlute( money.getWhiteFlute() )
                .gold( money.getGold() )
                .build();
    }
}
