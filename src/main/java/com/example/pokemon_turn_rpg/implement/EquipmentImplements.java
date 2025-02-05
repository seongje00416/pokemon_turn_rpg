package com.example.pokemon_turn_rpg.implement;

import com.example.pokemon_turn_rpg.common.PageResponse;
import com.example.pokemon_turn_rpg.common.SuccessResponse;
import com.example.pokemon_turn_rpg.controller.EquipmentController;
import com.example.pokemon_turn_rpg.dto.request.ChangeNormalEquipmentRequest;
import com.example.pokemon_turn_rpg.dto.response.GetHoldItemResponse;
import com.example.pokemon_turn_rpg.dto.response.GetUserNormalEquipmentResponse;
import com.example.pokemon_turn_rpg.dto.response.GetUserSpecialEquipmentResponse;
import com.example.pokemon_turn_rpg.dto.response.GetWearEquipmentResponse;
import com.example.pokemon_turn_rpg.service.EquipmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping( "/api/v1/equipment" )
@RequiredArgsConstructor
public class EquipmentImplements implements EquipmentController {
    private final EquipmentService equipmentService;

    @Override
    public ResponseEntity<SuccessResponse<GetWearEquipmentResponse>> getWearEquipment(Long userPokemonId) {
        return SuccessResponse.of( equipmentService.getWearEquipment( userPokemonId ) ).asHttp(HttpStatus.OK);
    }

    @Override
    public ResponseEntity<SuccessResponse<Void>> changeNormalEquipment(ChangeNormalEquipmentRequest changeNormalEquipmentRequest) {
        equipmentService.changePokemonWornEquipment( changeNormalEquipmentRequest.userPokemonId(), changeNormalEquipmentRequest.beforeEquipmentId(), changeNormalEquipmentRequest.afterEquipmentId());
        return SuccessResponse.ofNoData().asHttp( HttpStatus.OK );
    }

    @Override
    public ResponseEntity<SuccessResponse<Void>> changeSpecialEquipment(Long userPokemonId, Long specialEquipmentId) {
        equipmentService.changePokemonWornSpecialEquipment( userPokemonId, specialEquipmentId );
        return SuccessResponse.ofNoData().asHttp( HttpStatus.OK );
    }

    @Override
    public ResponseEntity<SuccessResponse<Void>> changeHoldItem(Long userPokemonId, Long holdItemId) {
        equipmentService.changePokemonHoldItem( userPokemonId, holdItemId );
        return SuccessResponse.ofNoData().asHttp( HttpStatus.OK );
    }

    @Override
    public ResponseEntity<SuccessResponse<GetUserNormalEquipmentResponse>> getUserNormalEquipmentList(Long userId) {
        return null;
    }

    @Override
    public ResponseEntity<SuccessResponse<GetUserSpecialEquipmentResponse>> getUserSpecialEquipmentList(Long userId) {
        return null;
    }

    @Override
    public ResponseEntity<SuccessResponse<GetHoldItemResponse>> getUserHoldItemList(Long userId) {
        return null;
    }
}
