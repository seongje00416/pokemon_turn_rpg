package com.example.pokemon_turn_rpg.dto.response;

import com.example.pokemon_turn_rpg.entity.Account;
import com.example.pokemon_turn_rpg.entity.User;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;

@Builder
@Schema( name = "Get User Profile Response", description = "사용자 프로필 조회 응답" )
public record GetUserProfileResponse(
        @Schema( description = "사용자 ID" )
        Long userId,
        @Schema( description = "계정 ID", implementation = Account.class )
        Account account,
        @Schema( description = "사용자 닉네임" )
        String nickname,
        @Schema( description = "사용자 레벨" )
        int level,
        @Schema( description = "사용자 경험치" )
        int exp,
        @Schema( description = "프로필 포켓몬 이미지" )
        String profilePokemon
) {
    public static GetUserProfileResponse of ( User user ){
        return GetUserProfileResponse.builder()
                .userId( user.getId() )
                .account( user.getAccount() )
                .nickname( user.getNickname() )
                .level( user.getLevel() )
                .exp( user.getExp() )
                .build();
    }
}
