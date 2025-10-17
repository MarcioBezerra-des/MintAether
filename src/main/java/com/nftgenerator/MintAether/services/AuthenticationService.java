package com.nftgenerator.MintAether.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.nftgenerator.MintAether.domain.user.User;
import com.nftgenerator.MintAether.dto.user.UserRequestDTO;
import com.nftgenerator.MintAether.repositories.UserRepository;

@Service
public class AuthenticationService {

    @Autowired
    private UserRepository userRepository;
    
    @Autowired
    private PasswordEncoder passwordEncoder;

    public void registerUser(UserRequestDTO data) {
        if (this.userRepository.findByEmail(data.email()).isPresent()) {
            throw new RuntimeException("Erro: O e-mail já está em uso!");
        }

        User newUser = new User();
        newUser.setName(data.name());
        newUser.setEmail(data.email());

        String hashedPassword = passwordEncoder.encode(data.password());
        newUser.setPassword(hashedPassword);
    
        this.userRepository.save(newUser);
    }
}
