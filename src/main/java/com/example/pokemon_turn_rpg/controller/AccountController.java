package com.example.pokemon_turn_rpg.controller;

public interface AccountController {
    // 계정 회원가입 - POST( CREATE )
    //  INPUT: email, password
    //  OUTPUT: id, isExist
    //  이메일과 비밀번호를 통해 계정을 만든다.
    //  해당 이메일로 만들어진 계정이 이미 있는 경우, 이미 같은 이메일로 만들어진 계정이 있음을 알리는 오류를 반환한다.
    
    // 계정 로그인 - GET( READ )
    //  INPUT: email, password
    //  OUTPUT: id, isExist, userId
    //  등록된 이메일과 비밀번호를 통해 로그인한다.
    //  해당 계정이 있을 경우 계정과 연결된 UserId를 반환하며, 계정이 없을 경우 연결된 계정이 없음을 알리는 오류를 반환한다.
}
