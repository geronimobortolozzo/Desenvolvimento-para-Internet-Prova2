package com.example.auth_api.controller;

import com.example.auth_api.config.JwtUtil;
import com.example.auth_api.entity.User;
import com.example.auth_api.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/auth")
public class AuthController {
    private final UserService userService;

    public AuthController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/register")
    public ResponseEntity<User> register(@RequestBody User user) {
        User savedUser = userService.registerUser(user.getUsername(), user.getPassword());
        return ResponseEntity.ok(savedUser);
    }

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody User user) {
        System.out.println("Tentando login com usuário: " + user.getUsername());

        Optional<User> optionalUser = userService.findByUsername(user.getUsername());

        if (optionalUser.isEmpty()) {
            System.out.println("Usuário não encontrado!");
            return ResponseEntity.status(401).body("Usuário não encontrado");
        }

        if (!optionalUser.get().getPassword().equals(user.getPassword())) {
            System.out.println("Senha incorreta!");
            return ResponseEntity.status(401).body("Senha incorreta");
        }

        String token = JwtUtil.generateToken(optionalUser.get().getUsername());
        return ResponseEntity.ok(token);
    }

}