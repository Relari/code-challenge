package com.example.codechallenge.service.impl;

import com.example.codechallenge.model.api.UserRequest;
import com.example.codechallenge.model.api.UserResponse;
import com.example.codechallenge.repository.UserRepository;
import com.example.codechallenge.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository repository;

    /**
     * Metodo que registra al usuario.
     * @param request {@link UserRequest}
     */
    @Override
    public void save(UserRequest request) {
    }

    /**
     * Metodo que retorna el listado de usuarios
     * @return {@link UserResponse[]}
     */
    @Override
    public List<UserResponse> users() {
        return null;
    }

    /**
     * Metodo que realiza la busqueda de un usuario desde el tipo.
     * @param type Tipo para identificar como va a ser la consulta (PHONE, EMAIL).
     * @param value Valor que va a ser utilizado para la busqueda.
     * @return {@link UserResponse}
     */
    @Override
    public UserResponse find(String type, String value) {
        return null;
    }

}
