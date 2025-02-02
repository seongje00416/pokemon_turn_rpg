package com.example.pokemon_turn_rpg.controller;

import com.example.pokemon_turn_rpg.common.SuccessResponse;
import com.example.pokemon_turn_rpg.dto.request.ChangeProfileImageRequest;
import com.example.pokemon_turn_rpg.dto.request.UseUserMoneyRequest;
import com.example.pokemon_turn_rpg.dto.request.UserExpRequest;
import com.example.pokemon_turn_rpg.dto.response.*;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Locale;

@Tag( name = "User API", description = "사용자 정보 및 보유 자원 관련 API" )
public interface UserController {
    // User 엔티티
    //  사용자 프로필 조회 - GET( READ )
    //      INPUT: id
    //      OUTPUT: id, nickname, profileImage, exp, level
    //      사용자 프로필 정보를 조회한다.
    @Operation( summary = "사용자 프로필 조회", description = "사용자 프로필 정보를 조회한다" )
    @ApiResponses( value = {
            @ApiResponse(
                    responseCode = "200",
                    description = "조회 성공"
            )
    })
    @GetMapping( "/userProfile/{userId}" )
    ResponseEntity<SuccessResponse<GetUserProfileResponse>> getUserProfile(
            @PathVariable Long userId
    );
    
    //  사용자 프로필 사진 변경 - PATCH( UPDATE )
    //      INPUT: id, profilePokemon
    //      OUTPUT: id
    //      사용자 프로필 포켓몬 이미지를 변경한다.
    @Operation( summary = "사용자 프로필 사진 변경", description = "사용자 프로필 포켓몬 이미지를 변경한다" )
    @ApiResponses( value = {
            @ApiResponse(
                    responseCode = "200",
                    description = "변경 성공"
            )
    })
    @PatchMapping( "/profileImage" )
    ResponseEntity<SuccessResponse<Void>> changeProfileImage (
            @RequestBody ChangeProfileImageRequest changeProfileImageRequest
    );

    //  사용자 닉네임 변경 - PATCH( UPDATE )
    //      INPUT: id, nickname
    //      OUTPUT: id
    //      사용자 프로필 닉네임을 변경한다.
    @Operation( summary = "사용자 프로필 닉네임 변경", description = "사용자 프로필 닉네임을 변경한다" )
    @ApiResponses( value = {
            @ApiResponse(
                    responseCode = "200",
                    description = "변경 성공"
            )
    })
    @PatchMapping( "/profileNickname" )
    ResponseEntity<SuccessResponse<Void>> changeProfileNickname (
            @RequestParam Long userId,
            @RequestParam String newNickname
    );

    //  사용자 경험치 증가 - PATCH( UPDATE )
    //      INPUT: id, increaseEXP
    //      OUTPUT: id, exp, level
    //      사용자 경험치를 증가시킨다.
    //      경험치양이 일정 양이 도달할 경우, 레벨업을 한다.
    @Operation( summary = "사용자 경험치 증가", description = "사용자 경험치를 증가시킨다. 일정 경험치 량이 채워지면 레벨업을 한다." )
    @ApiResponses( value = {
            @ApiResponse(
                    responseCode = "200",
                    description = "적용 완료"
            )
    })
    @PatchMapping( "/userExpUpdate" )
    ResponseEntity<SuccessResponse<UserExpResponse>> userExpUpdate (
            @RequestBody UserExpRequest userExpRequest
    );
    
    // UserPokemon 엔티티
    //  뽑은 포켓몬 등록 - POST( CREATE )
    //      INPUT: userId, pokemonId
    //      OUTPUT: id
    //      포획에서 얻은 포켓몬을 User의 포켓몬으로 등록한다.
    @Operation( summary = "뽑은 포켓몬을 등록한다", description = "포획에서 얻은 포켓몬을 등록한다" )
    @ApiResponses( value = {
            @ApiResponse(
                    responseCode = "200",
                    description = "등록 성공"
            )
    })
    @PostMapping( "/addUserPokemon" )
    ResponseEntity<SuccessResponse<Void>> addUserPokemon(
            @RequestParam Long userId,
            @RequestParam Long pokemonId
    );

    //  보유 포켓몬 목록 조회 - GET( READ )
    //      INPUT: userId
    //      OUTPUT: userPokemonId, level, name
    //      User가 보유하고 있는 포켓몬 목록을 보여준다.
    @Operation( summary = "보유 포켓몬 목록 조회", description = "사용자가 보유하고 있는 포켓몬 목록을 보여준다" )
    @ApiResponses( value = {
            @ApiResponse(
                    responseCode = "200",
                    description = "조회 성공"
            )
    })
    @GetMapping( "/getUserPokemonList/{userId}" )
    ResponseEntity<SuccessResponse<GetUserPokemonListResponse>> getUserPokemonList (
            @PathVariable Long userId
    );
    
    // 보유 포켓몬 상세 조회 - GET( READ )
    //      INPUT: userPokemonId
    //      OUTPUT: userPokemonId, name, level, pokemonId
    //      User가 선택한 자신의 포켓몬에 대한 자세한 정보를 보여준다.
    @Operation( summary = "보유 포켓몬 상세 조회", description = "사용자가 선택한 자신의 포켓몬에 대한 자세한 정보를 보여준다" )
    @ApiResponses( value = {
            @ApiResponse(
                    responseCode = "200",
                    description = "조회 성공"
            )
    })
    @GetMapping( "/userPokemon/{userPokemonId}" )
    ResponseEntity<SuccessResponse<GetUserPokemonDetailResponse>> getUserPokemonDetail (
            @PathVariable Long userPokemonId
    );
    
    // Money 엔티티
    //  보유 재화 조회 - GET( READ )
    //      INPUT: userId
    //      OUTPUT: id, userId, pokeBall, greatBall, ultraBall, whiteFlute, coin
    //      User가 보유하고 있는 재화량을 보여준다.
    @Operation( summary = "보유 재화 조회", description = "사용자가 보유중인 재화량을 보여준다" )
    @ApiResponses( value = {
            @ApiResponse(
                    responseCode = "200",
                    description = "조회 성공"
            )
    })
    @GetMapping( "/getUserMoney/{userId}" )
    ResponseEntity<SuccessResponse<GetUserMoneyResponse>> getUserMoney (
            @PathVariable Long userId
    );

    //  뽑기 재화 사용 - PATCH( UPDATE )
    //      INPUT: userId, moneyType, useAmount
    //      OUTPUT: id, userId
    //      포획을 진행할 경우, 보유하고 있는 재화량을 차감한다.
    @Operation( summary = "특정 재화 사용", description = "포획을 진행할 때 보유하고 있는 재화량을 차감한다" )
    @ApiResponses( value = {
            @ApiResponse(
                    responseCode = "200",
                    description = "적용 완료"
            )
    })
    @PatchMapping( "/useUserMoney" )
    ResponseEntity<SuccessResponse<Void>> useUserMoney (
            @RequestBody UseUserMoneyRequest useUserMoneyRequest
    );
}
