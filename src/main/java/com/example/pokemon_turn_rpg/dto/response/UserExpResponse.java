package com.example.pokemon_turn_rpg.dto.response;

import com.example.pokemon_turn_rpg.entity.User;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;

@Builder
@Schema( name = "User Exp Response", description = "사용자 경험치 조절 응답" )
public record UserExpResponse(
        @Schema( description = "사용자 ID" )
        Long userId,
        @Schema( description = "현재 경험치량" )
        Integer afterExp,
        @Schema( description = "현재 레벨" )
        Integer level
) {
    public static UserExpResponse of ( User user ){
        return UserExpResponse.builder()
                .userId( user.getId() )
                .afterExp( user.getExp() )
                .level( user.getLevel() )
                .build();
    }
}
