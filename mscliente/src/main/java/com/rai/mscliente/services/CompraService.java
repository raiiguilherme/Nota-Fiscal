package com.rai.mscliente.services;

import com.rai.mscliente.domain.Compra;
import com.rai.mscliente.repository.CompraRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CompraService {
    private final CompraRepository repository;

    public Compra criarCompra(Compra compra){
        repository.save(compra);
        return compra;

    }
}
