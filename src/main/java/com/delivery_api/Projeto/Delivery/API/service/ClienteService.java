package com.delivery_api.Projeto.Delivery.API.service;

import com.delivery_api.Projeto.Delivery.API.entity.Cliente;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {

    public static List<Cliente> listarAtivos() {
        return new ArrayList<>();
    }

    public static Optional<Cliente> buscarPorId(long id) {
        return Optional.of(new Cliente());
    }

    public static Cliente atualizar(Long id, Cliente cliente) {
        return new Cliente();
    }

    public static void inativar(Long id) {

    }


    public Cliente cadastrar(Cliente cliente){
        return new Cliente();
    }

}
