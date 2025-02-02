package com.example.pokemon_turn_rpg.dto.response;

import com.example.pokemon_turn_rpg.entity.UserPokemon;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;

@Builder
@Schema( name = "Get User Pokemon Detail Response", description = "사용자 포켓몬 상세 정보 조회 응답" )
public record GetUserPokemonDetailResponse(
        @Schema( description = "유저 포켓몬 ID" )
        Long userPokemonId,
        @Schema( description = "포켓몬 이름" )
        String name,
        @Schema( description = "포켓몬 레벨" )
        Integer level,
        @Schema( description = "포켓몬 ID" )
        Long pokemonId
) {
    public static GetUserPokemonDetailResponse of (UserPokemon userPokemon ){
        return GetUserPokemonDetailResponse.builder()
                .userPokemonId( userPokemon.getId() )
                .name( userPokemon.getPokemon().getName() )
                .level( userPokemon.getLevel() )
                .pokemonId( userPokemon.getPokemon().getId() )
                .build();
    }
}
