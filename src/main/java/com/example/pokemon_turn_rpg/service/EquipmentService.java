package com.example.pokemon_turn_rpg.service;

import com.example.pokemon_turn_rpg.common.PageResponse;
import com.example.pokemon_turn_rpg.dto.response.GetWearEquipmentResponse;
import com.example.pokemon_turn_rpg.entity.Equipment;
import com.example.pokemon_turn_rpg.entity.HoldItem;
import com.example.pokemon_turn_rpg.entity.SpecialEquipment;
import com.example.pokemon_turn_rpg.repository.EquipmentRepository;
import com.example.pokemon_turn_rpg.repository.HoldItemRepository;
import com.example.pokemon_turn_rpg.repository.SpecialEquipmentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class EquipmentService {
    private final EquipmentRepository equipmentRepository;
    private final SpecialEquipmentRepository specialEquipmentRepository;
    private final HoldItemRepository holdItemRepository;

    public GetWearEquipmentResponse getWearEquipment(Long pokemonId) {
        List<Equipment> wornEquipment = equipmentRepository.findAllByWornPokemonId( pokemonId );
        Optional<SpecialEquipment> wornSpecialEquipment = specialEquipmentRepository.findAllByWornPokemonId(pokemonId );
        Optional<HoldItem> wornHoldItem = holdItemRepository.findAllByWornPokemonId(pokemonId );

        return GetWearEquipmentResponse.of( pokemonId, wornEquipment.get(0), wornEquipment.get(1), wornEquipment.get(2), wornEquipment.get(3), wornSpecialEquipment.get(), wornHoldItem.get() );
    }

    public void changePokemonWornEquipment( Long userPokemonId, Long before, Long after ) {
        Equipment beforeEquipment = equipmentRepository.findById( before ).orElseThrow();
        beforeEquipment.update( Long.MIN_VALUE );
        Equipment afterEquipment = equipmentRepository.findById( after ).orElseThrow();
        afterEquipment.update( userPokemonId );
    }
    public void changePokemonWornSpecialEquipment( Long userPokemonId, Long after ){
        SpecialEquipment beforeEquipment = specialEquipmentRepository.findAllByWornPokemonId( userPokemonId ).orElseThrow();
        beforeEquipment.update( Long.MIN_VALUE );
        SpecialEquipment afterEquipment = specialEquipmentRepository.findById( after ).orElseThrow();
        afterEquipment.update( userPokemonId );

    }
    public void changePokemonHoldItem( Long userPokemonId, Long after ){
        HoldItem beforeItem = holdItemRepository.findAllByWornPokemonId( userPokemonId ).orElseThrow();
        beforeItem.update( Long.MIN_VALUE );
        HoldItem afterItem = holdItemRepository.findById( after ).orElseThrow();
        afterItem.update( userPokemonId );
    }
}
