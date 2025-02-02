package com.example.pokemon_turn_rpg.service;

import com.example.pokemon_turn_rpg.repository.EquipmentRepository;
import com.example.pokemon_turn_rpg.repository.HoldItemRepository;
import com.example.pokemon_turn_rpg.repository.SpecialEquipmentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class EquipmentService {
    private final EquipmentRepository equipmentRepository;
    private final SpecialEquipmentRepository specialEquipmentRepository;
    private final HoldItemRepository holdItemRepository;
}
