package com.example.pokemon_turn_rpg.implement;

import com.example.pokemon_turn_rpg.common.SuccessResponse;
import com.example.pokemon_turn_rpg.controller.UserController;
import com.example.pokemon_turn_rpg.dto.request.ChangeProfileImageRequest;
import com.example.pokemon_turn_rpg.dto.request.UseUserMoneyRequest;
import com.example.pokemon_turn_rpg.dto.request.UserExpRequest;
import com.example.pokemon_turn_rpg.dto.response.*;
import com.example.pokemon_turn_rpg.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping( "/api/v1/user" )
@RestController
@RequiredArgsConstructor
public class UserImplements implements UserController {
    private UserService userService;

    @Override
    public ResponseEntity<SuccessResponse<GetUserProfileResponse>> getUserProfile(Long userId) {
        return null;
    }

    @Override
    public ResponseEntity<SuccessResponse<Void>> changeProfileImage(ChangeProfileImageRequest changeProfileImageRequest) {
        return null;
    }

    @Override
    public ResponseEntity<SuccessResponse<Void>> changeProfileNickname(Long userId, String newNickname) {
        return null;
    }

    @Override
    public ResponseEntity<SuccessResponse<UserExpResponse>> userExpUpdate(UserExpRequest userExpRequest) {
        return null;
    }

    @Override
    public ResponseEntity<SuccessResponse<Void>> addUserPokemon(Long userId, Long pokemonId) {
        return null;
    }

    @Override
    public ResponseEntity<SuccessResponse<GetUserPokemonListResponse>> getUserPokemonList(Long userId) {
        return null;
    }

    @Override
    public ResponseEntity<SuccessResponse<GetUserPokemonDetailResponse>> getUserPokemonDetail(Long userPokemonId) {
        return null;
    }

    @Override
    public ResponseEntity<SuccessResponse<GetUserMoneyResponse>> getUserMoney(Long userId) {
        return null;
    }

    @Override
    public ResponseEntity<SuccessResponse<Void>> useUserMoney(UseUserMoneyRequest useUserMoneyRequest) {
        return null;
    }
}
