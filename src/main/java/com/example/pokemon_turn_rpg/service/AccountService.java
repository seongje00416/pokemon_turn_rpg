package com.example.pokemon_turn_rpg.service;

import com.example.pokemon_turn_rpg.entity.Account;
import com.example.pokemon_turn_rpg.repository.AccountRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class AccountService {
    private final AccountRepository accountRepository;

    @Transactional
    public void registerAccount( String email, String password ){
        Account account = new Account();
        account.setEmail( email );
        account.setPassword( password );
        accountRepository.save( account );
    }

    public Long login( String email, String password ){
        return accountRepository.findAccountByEmailAndPassword( email, password ) ;
    }
}
