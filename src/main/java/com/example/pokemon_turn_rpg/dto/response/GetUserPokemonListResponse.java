package com.example.pokemon_turn_rpg.dto.response;

import com.example.pokemon_turn_rpg.entity.UserPokemon;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;

@Builder
@Schema( name = "Get User Pokemon List Response", description = "사용자 보유 포켓몬 목록 조회 응답" )
public record GetUserPokemonListResponse(
        @Schema( description = "포켓몬 ID" )
        Long userPokemonId,
        @Schema( description = "포켓몬 레벨")
        Integer level,
        @Schema( description = "포켓몬 이름" )
        String name
) {
    public static GetUserPokemonListResponse of( UserPokemon userPokemon ){
        return GetUserPokemonListResponse.builder()
                .userPokemonId( userPokemon.getId() )
                .level( userPokemon.getLevel() )
                .name( userPokemon.getPokemon().getName() )
                .build();
    }
}
