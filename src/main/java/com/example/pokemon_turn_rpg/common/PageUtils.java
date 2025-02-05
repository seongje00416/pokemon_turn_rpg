package com.example.pokemon_turn_rpg.common;

import org.springframework.data.domain.Page;

public class PageUtils {
    public static <T> PageResponse<T> toPageResponse(Page<T> page) {
        return new PageResponse<>(page.getNumber(), page.getSize(), page.getTotalElements(), page.getContent());
    }
}
