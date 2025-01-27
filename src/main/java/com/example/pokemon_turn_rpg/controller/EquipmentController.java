package com.example.pokemon_turn_rpg.controller;

import io.swagger.v3.oas.annotations.tags.Tag;

@Tag( name = "Equipment Controller", description = "보유 장비 관련 API" )
public interface EquipmentController {
    // 착용하고 있는 장비 목록 조회
    //  INPUT: userPokemonId
    //  OUTPUT: normalEquipmentId, specialEquipmentId, holdItemId

    // 일반 장비 목록 조회
    //  INPUT: userID
    //  OUTPUT: normalEquipmentId, name, mainOption, mainValue, subOption, subValue

    // 특수 장비 목록 조회
    //  INPUT: userId
    //  OUTPUT: specialEquipmentId
    
    // 지니는 도구 목록 조회
    //  INPUT: userId
    //  OUTPUT: holdItemId

}
