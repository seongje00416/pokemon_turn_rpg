package com.example.pokemon_turn_rpg.dto.request;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema( name = "Change Profile Image Request", description = "사용자 프로필 변경 요청" )
public record ChangeProfileImageRequest(
        @Schema( description = "사용자 ID")
        Long userId,
        @Schema( description = "변경하고자 하는 포켓몬" )
        String afterPokemon
) {

}
