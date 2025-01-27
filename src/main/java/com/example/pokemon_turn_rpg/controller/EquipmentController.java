package com.example.pokemon_turn_rpg.controller;

import io.swagger.v3.oas.annotations.tags.Tag;

@Tag( name = "Equipment Controller", description = "보유 장비 관련 API" )
public interface EquipmentController {
    // 착용하고 있는 장비 목록 조회 - GET( READ )
    //  INPUT: userPokemonId
    //  OUTPUT: normalEquipmentId, specialEquipmentId, holdItemId
    //  해당 포켓몬이 착용하고 있는 모든 장비 목록을 보여준다.

    // 착용하고 있는 기본 장비 변경 - PATCH( UPDATE )
    //  INPUT: userPokemonId, normalEquipmentId
    //  OUTPUT: normalEquipmentId
    //  해당 포켓몬의 기본 장비를 변경한다.

    // 착용하고 있는 특수 장비 변경 - PATCH( UPDATE )
    //  INPUT: userPokemonId, specialEquipmentId
    //  OUTPUT: specialEquipmentId
    //  해당 포켓몬의 특수 장비를 변경한다.

    // 착용하고 있는 지니는 도구 변경 - PATCH( UPDATE )
    //  INPUT: userPokemonId, holdItemId
    //  OUTPUT: holdItemId
    //  해당 포켓몬의 지니는 도구를 변경한다.

    // 일반 장비 목록 조회 - GET( READ )
    //  INPUT: userID
    //  OUTPUT: normalEquipmentId, name, mainOption, mainValue, subOption, subValue
    //  User가 보유하고 있는 기본 장비 목록들을 보여준다.

    // 특수 장비 목록 조회 - GET( READ )
    //  INPUT: userId, pokemonId
    //  OUTPUT: specialEquipmentId
    //  User가 보유하고 있는 해당 포켓몬이 사용할 수 있는 특수 장비 목록들을 보여준다.
    
    // 지니는 도구 목록 조회 - GET( READ )
    //  INPUT: userId
    //  OUTPUT: holdItemId
    //  User가 보유하고 있는 지니는 도구 목록들을 보여준다.

}
