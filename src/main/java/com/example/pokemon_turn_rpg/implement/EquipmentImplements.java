package com.example.pokemon_turn_rpg.implement;

import com.example.pokemon_turn_rpg.controller.EquipmentController;
import com.example.pokemon_turn_rpg.service.EquipmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping( "/api/v1/equipment" )
@RequiredArgsConstructor
public class EquipmentImplements implements EquipmentController {
    private EquipmentService equipmentService;
}
