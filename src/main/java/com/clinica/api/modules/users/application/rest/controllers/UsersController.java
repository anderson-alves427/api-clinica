package com.clinica.api.modules.users.application.rest.controllers;

import com.clinica.api.modules.users.domain.dtos.DataRegisterUser;
import com.clinica.api.modules.users.domain.entities.User;
import com.clinica.api.modules.users.domain.repositories.IUsersRepository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.time.Clock;

@RestController
@RequestMapping("/user")
public class UsersController {

    private IUsersRepository repository;
    @PostMapping
    @Transactional
    public void register(@RequestBody DataRegisterUser data) {
        System.out.println(data);
    }
}
