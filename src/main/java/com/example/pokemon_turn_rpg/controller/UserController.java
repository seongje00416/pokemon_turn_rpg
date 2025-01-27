package com.example.pokemon_turn_rpg.controller;

import io.swagger.v3.oas.annotations.tags.Tag;

@Tag( name = "User API", description = "사용자 정보 및 보유 자원 관련 API" )
public interface UserController {
    // User 엔티티
    //  사용자 프로필 조회
    //      INPUT: id
    //      OUTPUT: id, nickname, profileImage, exp, level
    
    //  사용자 프로필 사진 변경
    //      INPUT: id
    //      OUTPUT: id, profileImage

    //
    
    // UserPokemon 엔티티
    //  뽑은 포켓몬 등록
    //      INPUT: userId, pokemonId
    //      OUTPUT: id

    //  보유 포켓몬 목록 조회
    //      INPUT: userId
    //      OUTPUT: userPokemonId, level, name
    
    // 보유 포켓몬 상세 조회
    //      INPUT: userPokemonId
    //      OUTPUT: userPokemonId, name, level, pokemonId
    
    // Money 엔티티
    //  보유 재화 조회
    //      INPUT: userId
    //      OUTPUT: id, userId, pokeBall, greatBall, ultraBall, whiteFlute, coin

    //  뽑기 재화 사용
    //      INPUT: userId, moneyType, useAmount
    //      OUTPUT: id, userId
}
