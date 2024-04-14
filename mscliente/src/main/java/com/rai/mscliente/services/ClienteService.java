package com.rai.mscliente.services;

import com.rai.mscliente.domain.Cliente;
import com.rai.mscliente.repository.ClienteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ClienteService {

    private final ClienteRepository repository;

    public void criarCliente(Cliente cliente){

        repository.save(cliente);
    }

    public Optional<Cliente> obterClientePorCpf(String cpf){

        return repository.findClienteByCpf(cpf);
    }
}
