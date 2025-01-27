package com.example.pokemon_turn_rpg.controller;

import io.swagger.v3.oas.annotations.tags.Tag;

@Tag( name = "User API", description = "사용자 정보 및 보유 자원 관련 API" )
public interface UserController {
    // User 엔티티
    //  사용자 프로필 조회 - GET( READ )
    //      INPUT: id
    //      OUTPUT: id, nickname, profileImage, exp, level
    //      사용자 프로필 정보를 조회한다.
    
    //  사용자 프로필 사진 변경 - PATCH( UPDATE )
    //      INPUT: id, profilePokemon
    //      OUTPUT: id
    //      사용자 프로필 포켓몬 이미지를 변경한다.

    //  사용자 닉네임 변경 - PATCH( UPDATE )
    //      INPUT: id, nickname
    //      OUTPUT: id
    //      사용자 프로필 닉네임을 변경한다.

    //  사용자 경험치 증가 - PATCH( UPDATE )
    //      INPUT: id, increaseEXP
    //      OUTPUT: id, exp, level
    //      사용자 경험치를 증가시킨다.
    //      경험치양이 일정 양이 도달할 경우, 레벨업을 한다.
    
    // UserPokemon 엔티티
    //  뽑은 포켓몬 등록 - POST( CREATE )
    //      INPUT: userId, pokemonId
    //      OUTPUT: id
    //      포획에서 얻은 포켓몬을 User의 포켓몬으로 등록한다.

    //  보유 포켓몬 목록 조회 - GET( READ )
    //      INPUT: userId
    //      OUTPUT: userPokemonId, level, name
    //      User가 보유하고 있는 포켓몬 목록을 보여준다.
    
    // 보유 포켓몬 상세 조회 - GET( READ )
    //      INPUT: userPokemonId
    //      OUTPUT: userPokemonId, name, level, pokemonId
    //      User가 선택한 자신의 포켓몬에 대한 자세한 정보를 보여준다.
    
    // Money 엔티티
    //  보유 재화 조회 - GET( READ )
    //      INPUT: userId
    //      OUTPUT: id, userId, pokeBall, greatBall, ultraBall, whiteFlute, coin
    //      User가 보유하고 있는 재화량을 보여준다.

    //  뽑기 재화 사용 - PATCH( UPDATE )
    //      INPUT: userId, moneyType, useAmount
    //      OUTPUT: id, userId
    //      포획을 진행할 경우, 보유하고 있는 재화량을 차감한다.
}
