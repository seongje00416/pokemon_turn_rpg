package com.example.pokemon_turn_rpg.controller;

import com.example.pokemon_turn_rpg.common.SuccessResponse;
import com.example.pokemon_turn_rpg.dto.request.ChangeNormalEquipmentRequest;
import com.example.pokemon_turn_rpg.dto.response.GetWearEquipmentResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Tag( name = "Equipment Controller", description = "보유 장비 관련 API" )
public interface EquipmentController {
    // 착용하고 있는 장비 목록 조회 - GET( READ )
    //  INPUT: userPokemonId
    //  OUTPUT: normalEquipmentId, specialEquipmentId, holdItemId
    //  해당 포켓몬이 착용하고 있는 모든 장비 목록을 보여준다.
    @Operation( summary = "착용 장비 목록 조회", description = "해당 포켓몬이 착용하고 있는 모든 장비 목록을 보여준다." )
    @ApiResponses( value = {
            @ApiResponse(
                    responseCode = "200",
                    description = "조회 성공"
            )
    })
    @GetMapping( "/wearEquipment/{userPokemonId}" )
    ResponseEntity<SuccessResponse<GetWearEquipmentResponse>> getWearEquipment(
            @PathVariable Long userPokemonId
    );

    // 착용하고 있는 기본 장비 변경 - PATCH( UPDATE )
    //  INPUT: userPokemonId, normalEquipmentId
    //  OUTPUT: normalEquipmentId
    //  해당 포켓몬의 기본 장비를 변경한다.
    @Operation( summary = "착용 기본 장비 변경", description = "해당 포켓몬의 기본 장비를 변경한다" )
    @ApiResponses( value = {
            @ApiResponse(
                    responseCode = "200",
                    description = "조회 성공"
            )
    })
    @PatchMapping( "/changeNormalEquipment" )
    ResponseEntity<SuccessResponse<Void>> changeNormalEquipment(
            @RequestBody ChangeNormalEquipmentRequest changeNormalEquipmentRequest
    );

    // 착용하고 있는 특수 장비 변경 - PATCH( UPDATE )
    //  INPUT: userPokemonId, specialEquipmentId
    //  OUTPUT: specialEquipmentId
    //  해당 포켓몬의 특수 장비를 변경한다.
    @Operation( summary = "착용 특수 장비 변경", description = "해당 포켓몬의 특수 장비를 변경한다." )
    @ApiResponses( value = {
            @ApiResponse(
                    responseCode = "200",
                    description = "조회 성공"
            )
    })
    @PatchMapping( "/changeSpecialEquipment" )
    ResponseEntity<SuccessResponse<Void>> changeSpecialEquipment(
            @RequestParam Long userPokemonId,
            @RequestParam Long specialEquipmentId
    );

    // 착용하고 있는 지니는 도구 변경 - PATCH( UPDATE )
    //  INPUT: userPokemonId, holdItemId
    //  OUTPUT: holdItemId
    //  해당 포켓몬의 지니는 도구를 변경한다.
    @Operation( summary = "착용하고 있는 지니는 도구 변경", description = "해당 포켓몬의 지니는 도구를 변경한다" )
    @ApiResponses( value = {
            @ApiResponse(
                    responseCode = "200",
                    description = "조회 성공"
            )
    })
    @PatchMapping( "/changeHoldItem" )
    ResponseEntity<SuccessResponse<Void>> changeHoldItem(
            @RequestParam Long userPokemonId,
            @RequestParam Long holdItemId
    );

    // 일반 장비 목록 조회 - GET( READ )
    //  INPUT: userID
    //  OUTPUT: normalEquipmentId, name, mainOption, mainValue, subOption, subValue
    //  User가 보유하고 있는 기본 장비 목록들을 보여준다.
    @Operation( summary = "일반 장비 목록 조회", description = "사용자가 보유하고 있는 기본 장비 목록들을 보여준다" )
    @ApiResponses( value = {
            @ApiResponse(
                    responseCode = "200",
                    description = "조회 성공"
            )
    })
    @GetMapping( "/getNormalEquipment/{userId}")
    ResponseEntity<SuccessResponse<GetUserNormalEquipmentResponse>> getUserNormalEquipmentList (
            @PathVariable Long userId
    );

    // 특수 장비 목록 조회 - GET( READ )
    //  INPUT: userId, pokemonId
    //  OUTPUT: specialEquipmentId
    //  User가 보유하고 있는 해당 포켓몬이 사용할 수 있는 특수 장비 목록들을 보여준다.
    @Operation( summary = "특수 장비 목록 조회", description = "사용자가 보유하고 있는 해당 포켓몬이 사용할 수 있는 특수 장비 목록들을 보여준다." )
    @ApiResponses( value = {
            @ApiResponse(
                    responseCode = "200",
                    description = "조회 성공"
            )
    })
    @GetMapping( "/getSpecialEquipment/{userId}" )
    ResponseEntity<SuccessResponse<GetUserSpecialEquipmentResponse>> getUserSpecialEquipmentList (
            @PathVariable Long userId
    );
    
    // 지니는 도구 목록 조회 - GET( READ )
    //  INPUT: userId
    //  OUTPUT: holdItemId
    //  User가 보유하고 있는 지니는 도구 목록들을 보여준다.
    @Operation( summary = "지니는 도구 목록 조회", description = "사용자가 보유하고 있는 지니는 도구 목록들을 보여준다" )
    @ApiResponses( value = {
            @ApiResponse(
                    responseCode = "200",
                    description = "조회 성공"
            )
    })
    @GetMapping( "/getHoldItem/{userId}" )
    ResponseEntity<SuccessResponse<GetHoldItemResponse>> getUserHoldItemList (
            @PathVariable Long userId
    );

}
