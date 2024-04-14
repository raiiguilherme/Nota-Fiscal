package com.rai.mscliente.services;

import com.rai.mscliente.domain.Produto;
import com.rai.mscliente.repository.ProdutoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProdutoService {

    private final ProdutoRepository repository;

    public Produto criarProduto(Produto produto){
        return repository.save(produto);
    }

}

