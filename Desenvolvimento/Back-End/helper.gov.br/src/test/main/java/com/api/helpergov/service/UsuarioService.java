package com.api.helpergov.service;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService implements UserDetailsService {

    @Override
    public UserDetails loadUserByUsername(String rh) {
       
        if ("12345".equals(rh)) {
            return User.builder()
                .username("maria")
                .password("{noop}senha") 
                .roles("USER")
                .build();
        } else {
            throw new UsernameNotFoundException("Número de Registro Hospitalar (RH) não encontrado.");
        }
    }
}
